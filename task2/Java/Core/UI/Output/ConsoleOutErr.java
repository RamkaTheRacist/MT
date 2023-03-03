package MiddleS.task2.Java.Core.UI.Output;

import MiddleS.task2.Java.Core.Logic.Interfaces.IConsoleOutErr;

public class ConsoleOutErr implements IConsoleOutErr {

    @Override
    public void idError() {
        System.out.println("[Such ID is busy or invalid]");
    }

    @Override
    public void emptyError() {
        System.out.println("!!!We have no toys!!!");
    }

    @Override
    public void commandError() {
        System.out.println("Invalid command. Try --help for help");
    }

    @Override
    public void addError() {
        System.out.println("[Such toy is exists already]");
    }

    @Override
    public void rollError() {
        System.out.println("-_- You are not lucky this time -_-");
    }

    @Override
    public void changeError() {
        System.out.println("[Chance should be between 0 and 100]");
    }

    @Override
    public void searchError() {
        System.out.println("[You dont have toy with such ID]");
    }
}
