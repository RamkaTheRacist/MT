package MiddleS.task2.Java.Core.Logic.Add;

import MiddleS.task2.Java.Core.ListOfToys.ListOfToys;
import MiddleS.task2.Java.Core.Logic.Interfaces.IConsoleInput;

public abstract class AddBase {
    ListOfToys list;
    IConsoleInput input;

    protected AddBase(ListOfToys list, IConsoleInput input) {
        this.list = list;
        this.input = input;
    }

    public abstract void add();
}