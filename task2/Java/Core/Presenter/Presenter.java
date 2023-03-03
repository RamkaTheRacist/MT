package MiddleS.task2.Java.Core.Presenter;

import MiddleS.task2.Java.Core.ListOfToys.ListOfToys;
import MiddleS.task2.Java.Core.Logic.Interfaces.IConsoleInput;
import MiddleS.task2.Java.Core.Logic.Interfaces.IConsoleOut;
import MiddleS.task2.Java.Core.Logic.Interfaces.IConsoleOutErr;
import MiddleS.task2.Java.Core.Logic.Interfaces.IConsoleOutSuc;
import MiddleS.task2.Java.Core.Logic.Interfaces.IFact;
import MiddleS.task2.Java.Core.Logic.Interfaces.IMenu;

public class Presenter {
    private String path;
    ListOfToys list;
    IConsoleOutErr err;
    IConsoleOut output;
    IConsoleOutSuc outsuc;
    IConsoleInput input;
    IFact factory;
    IMenu menu;

    public Presenter(String path, ListOfToys list, IConsoleOutErr err, IConsoleOut output, IConsoleOutSuc outsuc,
            IConsoleInput input, IFact factory, IMenu menu) {
        this.path = path;
        this.list = list;
        this.err = err;
        this.output = output;
        this.outsuc = outsuc;
        this.input = input;
        this.factory = factory;
        this.menu = menu;

    }

    public void doThis() {
        String choose = "";
        while (!choose.equals("Leave")) {
            menu.showMenu();
            choose = input.setCommand();
            factory.makeOperation(path, choose, list, err, output, outsuc,
                    input);
        }
    }
}