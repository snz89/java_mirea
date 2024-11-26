package test;

import button.*;
import checkbox.*;
import factory.*;

public class TestFaсtory {
    public static void main(String[] args) {
        GUIFactory winFactory = new WinFactory();
        Button winButton = winFactory.createButton();
        Checkbox winCheckbox = winFactory.createCheckbox();

        winButton.draw();
        winCheckbox.draw();

        GUIFactory macFactory = new MacFactory();
        Button macButton = macFactory.createButton();
        Checkbox macCheckbox = macFactory.createCheckbox();

        macButton.draw();
        macCheckbox.draw();
    }
}
