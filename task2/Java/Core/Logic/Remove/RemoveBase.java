package MiddleS.task2.Java.Core.Logic.Remove;

import MiddleS.task2.Java.Core.ListOfToys.ListOfToys;
import MiddleS.task2.Java.Core.Toy.Toy;

public abstract class RemoveBase {
    ListOfToys list;

    protected RemoveBase(ListOfToys list) {
        this.list = list;
    }

    public abstract void remove(Toy toy);
}