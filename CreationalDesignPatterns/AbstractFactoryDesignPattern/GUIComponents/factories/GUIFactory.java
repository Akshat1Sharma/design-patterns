package AbstractFactoryDesignPattern.GUIComponents.factories;

import AbstractFactoryDesignPattern.GUIComponents.buttons.Button;
import AbstractFactoryDesignPattern.GUIComponents.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
