package MiddleS.task2.Java.Core.UI.Output;

import MiddleS.task2.Java.Core.Logic.Interfaces.IMenu;

public class Menu2 implements IMenu {

    @Override
    public void showMenu() {
        System.out.println("Do you want to change chances of drop for toys or add some new?");
    }

}
