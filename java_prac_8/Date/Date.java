package Date;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        String[] months = {"январь", "февраль", "март", "апрель", "май", "июнь","июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите номер месяца (от 1 до 12): ");

        try {
            int inputMonth = sc.nextInt();
            int year;

            if (inputMonth == 2) {
                System.out.print("Введите год: ");
                year = sc.nextInt();
                if (year % 4 == 0) {
                    System.out.printf("Месяц %s, длительность: %d\n", months[inputMonth - 1], dom[inputMonth - 1] + 1);
                }
                else {
                    System.out.printf("Месяц %s, длительность: %d\n", months[inputMonth - 1], dom[inputMonth - 1]);
                }
            }
            else {
                System.out.printf("Месяц %s, длительность: %d\n", months[inputMonth - 1], dom[inputMonth - 1]);
            }
            
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Недопустимое число");
        }
        catch (InputMismatchException ex) {
            System.out.println("Введите целое число");
        }
        finally {
            sc.close();
        }
    }
}
