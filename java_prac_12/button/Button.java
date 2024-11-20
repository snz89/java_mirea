package button;

import platform.Platform;

public abstract class Button {
    protected Platform platform;
    
    public Platform draw() {
        return platform;
    }
}
