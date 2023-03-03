package MiddleS.task2.Java.Core.UI.Output;

import MiddleS.task2.Java.Core.Logic.Interfaces.IMenu;

public class Menu1 implements IMenu {

    @Override
    public void showMenu() {
        System.out.println("Wellcome. Are you Owner or Guest?");
    }

}
