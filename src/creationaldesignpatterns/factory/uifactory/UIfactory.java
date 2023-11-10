package creationaldesignpatterns.factory.uifactory;

import creationaldesignpatterns.factory.components.button.Button;
import creationaldesignpatterns.factory.components.dropdown.Dropdown;
import creationaldesignpatterns.factory.components.menu.Menu;

public interface UIfactory {
    Button createButton();
    Menu createMenu();
    Dropdown createDropdown();
}
