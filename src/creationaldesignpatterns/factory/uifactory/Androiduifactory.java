package creationaldesignpatterns.factory.uifactory;

import creationaldesignpatterns.factory.components.button.Androidbutton;
import creationaldesignpatterns.factory.components.button.Button;
import creationaldesignpatterns.factory.components.dropdown.Androiddropdown;
import creationaldesignpatterns.factory.components.dropdown.Dropdown;
import creationaldesignpatterns.factory.components.menu.Androidmenu;
import creationaldesignpatterns.factory.components.menu.Menu;

public class Androiduifactory implements UIfactory{
    @Override
    public Button createButton() {
        return new Androidbutton();
    }

    @Override
    public Menu createMenu() {
        return new Androidmenu();
    }

    @Override
    public Dropdown createDropdown() {
        return new Androiddropdown();
    }
}
