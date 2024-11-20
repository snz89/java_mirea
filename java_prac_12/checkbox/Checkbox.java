package checkbox;

import platform.Platform;

public abstract class Checkbox {
    protected String value;
    protected Platform platform;

    public String sendValue() {
        if (value == null) return "";
        String valueToSend = value;
        value = null;
        return valueToSend;
    }

    public void getValue(String value) {
        this.value = value;
    }

    public Platform draw() {
        return platform;
    }
}
