package Controller;

public class Control_Menu {
    public static void menu() {
        do {
            Control_ListMenu.mainMenu();
            int n = Input_Control.enterChoose(3);
            Control_Switch.mainSwitch(n);
        } while (true);
    }
}
