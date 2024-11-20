package factory;

import button.Button;
import checkbox.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckBox();
}
