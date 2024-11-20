package factory;

import button.Button;
import button.MacButton;
import checkbox.Checkbox;
import checkbox.MacCheckbox;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new MacCheckbox();
    }
}
