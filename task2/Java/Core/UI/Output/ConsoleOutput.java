package MiddleS.task2.Java.Core.UI.Output;

import MiddleS.task2.Java.Core.Logic.Interfaces.IConsoleOut;

public class ConsoleOutput implements IConsoleOut {

    @Override
    public void getPrize(String value) {
        System.out.printf("---You won: %s---\n", value);
    }

    @Override
    public void getHelpGuest() {
        System.out
                .println(
                        "1)Roll - try to win any toy\n2)Leave - take all what you got and leave\n3)--help - for help\n");
    }

    @Override
    public void getHelpOwner() {
        System.out
                .println(
                        "1)Add - add new toy\n2)Set - set chance of drop for toy\n3)Leave - stop to configurate\n4)--help - for help\n");
    }

    @Override
    public void getHelpMain() {
        System.out
                .println("1)Owner - our owner\n2)Guest - our guest\n3)Leave - leave us\n4)--help - for help\n");
    }

}
