package MiddleS.task2.Java.Core.Logic.ChangeDropChance;

import MiddleS.task2.Java.Core.ListOfToys.ListOfToys;
import MiddleS.task2.Java.Core.Logic.Interfaces.IConsoleInput;
import MiddleS.task2.Java.Core.Toy.Toy;

public abstract class ChangeDropChance {
    ListOfToys list;
    IConsoleInput input;

    protected ChangeDropChance(ListOfToys list, IConsoleInput input) {
        this.list = list;
        this.input = input;
    }

    public abstract void change(Toy toy);
}
