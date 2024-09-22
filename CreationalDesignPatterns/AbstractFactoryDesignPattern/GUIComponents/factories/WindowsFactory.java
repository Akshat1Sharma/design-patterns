package AbstractFactoryDesignPattern.GUIComponents.factories;

import AbstractFactoryDesignPattern.GUIComponents.buttons.Button;
import AbstractFactoryDesignPattern.GUIComponents.buttons.WindowsButton;
import AbstractFactoryDesignPattern.GUIComponents.checkboxes.Checkbox;
import AbstractFactoryDesignPattern.GUIComponents.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
       return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }

}
