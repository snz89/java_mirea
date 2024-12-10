import java.io.*;
import java.net.*;
import java.util.*;

public class CalculatorHttpServer {
    private static final int PORT = 1313;

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Calculator HTTP Server запущен на порту " + PORT);
            while (true) {
                try (Socket clientSocket = serverSocket.accept()) {
                    handleClient(clientSocket);
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка запуска сервера: " + e.getMessage());
        }
    }

    private static void handleClient(Socket clientSocket) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream());
        String line = in.readLine();
        if (line == null) return;

        String[] requestParts = line.split(" ");
        String method = requestParts[0];
        String path = requestParts[1];

        if (method.equals("GET") && path.startsWith("/calculate")) {
            handleCalculateRequest(path, out);
        } else {
            handleNotFound(out);
        }
        out.flush();
    }

    private static void handleCalculateRequest(String path, PrintWriter out) {
        Map<String, String> queryParams = parseQueryParams(path);
        try {
            if (!queryParams.containsKey("a") || !queryParams.containsKey("b") || !queryParams.containsKey("op")) {
                throw new IllegalArgumentException("Missing parameters");
            }

            double a = Double.parseDouble(queryParams.get("a"));
            double b = Double.parseDouble(queryParams.get("b"));
            String op = queryParams.get("op");

            double result = calculate(a, b, op);
            sendHttpResponse(out, 200, "<html><body><h1>Result: " + result + "</h1></body></html>");
        } catch (NumberFormatException e) {
            sendHttpResponse(out, 400, "<html><body><h1>Error: Invalid number format</h1></body></html>");
        } catch (ArithmeticException e) {
            sendHttpResponse(out, 400, "<html><body><h1>Error: " + e.getMessage() + "</h1></body></html>");
        } catch (IllegalArgumentException e) {
            sendHttpResponse(out, 400, "<html><body><h1>Error: " + e.getMessage() + "</h1></body></html>");
        }
    }

    private static Map<String, String> parseQueryParams(String path) {
        Map<String, String> queryParams = new HashMap<>();
        int queryStart = path.indexOf("?");
        if (queryStart != -1) {
            String[] pairs = path.substring(queryStart + 1).split("&");
            for (String pair : pairs) {
                String[] keyValue = pair.split("=");
                if (keyValue.length == 2) {
                    queryParams.put(keyValue[0], keyValue[1]);
                }
            }
        }
        return queryParams;
    }

    private static double calculate(double a, double b, String op) {
        return switch (op) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> {
                if (b == 0) throw new ArithmeticException("Division by zero");
                yield a / b;
            }
            default -> throw new IllegalArgumentException("Unsupported operation: " + op);
        };
    }

    private static void handleNotFound(PrintWriter out) {
        sendHttpResponse(out, 404, "<html><body><h1>404 Not Found</h1></body></html>");
    }

    private static void sendHttpResponse(PrintWriter out, int statusCode, String body) {
        out.println("HTTP/1.1 " + statusCode + " OK");
        out.println("Content-Type: text/html");
        out.println("Content-Length: " + body.length());
        out.println();
        out.println(body);
    }
}
