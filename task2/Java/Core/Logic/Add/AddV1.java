package MiddleS.task2.Java.Core.Logic.Add;

import MiddleS.task2.Java.Core.ListOfToys.ListOfToys;
import MiddleS.task2.Java.Core.Logic.Interfaces.IConsoleInput;
import MiddleS.task2.Java.Core.Logic.Interfaces.IConsoleOutErr;
import MiddleS.task2.Java.Core.Logic.Interfaces.IConsoleOutSuc;
import MiddleS.task2.Java.Core.Toy.Toy;

public class AddV1 extends AddBase {
    IConsoleOutSuc outsuc;
    IConsoleOutErr err;

    public AddV1(ListOfToys list, IConsoleInput input, IConsoleOutSuc outsuc, IConsoleOutErr err) {
        super(list, input);
        this.outsuc = outsuc;
        this.err = err;
    }

    @Override
    public void add() {
        Toy tmp = new Toy(input.setId(), input.setName(), input.setQuantity(), input.setChance());
        if (list.ifExist(tmp)) {
            err.addError();
        } else {
            this.list.add(tmp);
            outsuc.addSuccess();
        }
    }
}
