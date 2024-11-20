package test;

import button.*;
import checkbox.*;
import factory.*;

public class TestFatory {
    public static void main(String[] args) {
        GUIFactory winFactory = new WinFactory();
        GUIFactory macFactory = new MacFactory();

        Button winButton = winFactory.createButton();
        Checkbox winCheckbox = winFactory.createCheckBox();

        Button macButton = macFactory.createButton();
        Checkbox macCheckbox = macFactory.createCheckBox();

        System.out.printf("Button 1: %s\n", winButton.draw());
        System.out.printf("Button 2: %s\n", macButton.draw());
        System.out.printf("Checkbox 1: %s\n", winCheckbox.draw());
        System.out.printf("Checkbox 2: %s\n", macCheckbox.draw());
    }    
}
