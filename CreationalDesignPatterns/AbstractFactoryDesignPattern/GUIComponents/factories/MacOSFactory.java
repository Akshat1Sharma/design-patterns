package AbstractFactoryDesignPattern.GUIComponents.factories;

import AbstractFactoryDesignPattern.GUIComponents.buttons.Button;
import AbstractFactoryDesignPattern.GUIComponents.buttons.MacOSButton;
import AbstractFactoryDesignPattern.GUIComponents.checkboxes.Checkbox;
import AbstractFactoryDesignPattern.GUIComponents.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
       return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }

}
