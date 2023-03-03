package MiddleS.task2.Java.Core.Logic.ChangeDropChance;

import MiddleS.task2.Java.Core.ListOfToys.ListOfToys;
import MiddleS.task2.Java.Core.Logic.Interfaces.IConsoleInput;
import MiddleS.task2.Java.Core.Logic.Interfaces.IConsoleOutErr;
import MiddleS.task2.Java.Core.Logic.Interfaces.IConsoleOutSuc;
import MiddleS.task2.Java.Core.Toy.Toy;

public class ChangeDropChanceV1 extends ChangeDropChance {
    IConsoleOutSuc outsuc;
    IConsoleOutErr err;

    public ChangeDropChanceV1(ListOfToys list, IConsoleInput input, IConsoleOutSuc outsuc, IConsoleOutErr err) {
        super(list, input);
        this.outsuc = outsuc;
        this.err = err;
    }

    @Override
    public void change(Toy toy) {
        int newChance = input.setChance();
        if ((newChance >= 0) && newChance <= 100) {
            toy.setChanceOfDrop(newChance);
            outsuc.changeSuccess();
            return;
        }
        err.changeError();
    }

}
