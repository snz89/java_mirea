package factory;

import button.Button;
import button.WinButton;
import checkbox.Checkbox;
import checkbox.WinCheckbox;

public class WinFactory  implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new WinCheckbox();
    }
}
