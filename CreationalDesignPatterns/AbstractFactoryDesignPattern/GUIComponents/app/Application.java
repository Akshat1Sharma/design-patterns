package AbstractFactoryDesignPattern.GUIComponents.app;

import AbstractFactoryDesignPattern.GUIComponents.buttons.Button;
import AbstractFactoryDesignPattern.GUIComponents.checkboxes.Checkbox;
import AbstractFactoryDesignPattern.GUIComponents.factories.GUIFactory;

public class Application {

    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }

}
