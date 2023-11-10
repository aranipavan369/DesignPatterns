package creationaldesignpatterns.factory.uifactory;

import creationaldesignpatterns.factory.components.button.Button;
import creationaldesignpatterns.factory.components.button.Iosbutton;
import creationaldesignpatterns.factory.components.dropdown.Dropdown;
import creationaldesignpatterns.factory.components.dropdown.Iosdropdown;
import creationaldesignpatterns.factory.components.menu.Iosmenu;
import creationaldesignpatterns.factory.components.menu.Menu;

public class Iosfactory implements UIfactory{

    @Override
    public Button createButton() {
        return new Iosbutton();
    }

    @Override
    public Menu createMenu() {
        return new Iosmenu();
    }

    @Override
    public Dropdown createDropdown() {
        return new Iosdropdown();
    }
}
