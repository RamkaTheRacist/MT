package MiddleS.task2.Java.Core.UI.Output;

import MiddleS.task2.Java.Core.Logic.Interfaces.IConsoleOutSuc;

public class ConsoleOutSuc implements IConsoleOutSuc {

    @Override
    public void rollSuc() {
        System.out.println("....Rolling....");
    }

    @Override
    public void addSuccess() {
        System.out.println("[Added toy]");
    }

    @Override
    public void changeSuccess() {
        System.out.println("[Changed chance]");
    }

}
