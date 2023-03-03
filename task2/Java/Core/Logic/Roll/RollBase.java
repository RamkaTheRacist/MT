package MiddleS.task2.Java.Core.Logic.Roll;

import java.util.List;

import MiddleS.task2.Java.Core.ListOfToys.ListOfToys;
import MiddleS.task2.Java.Core.Logic.Interfaces.IConsoleOut;
import MiddleS.task2.Java.Core.Logic.Interfaces.IConsoleOutErr;

public abstract class RollBase {
    IConsoleOut output;
    IConsoleOutErr err;
    ListOfToys list;
    List<String> array;

    protected RollBase(ListOfToys list, IConsoleOut output, IConsoleOutErr err, List<String> array) {
        this.output = output;
        this.err = err;
        this.list = list;
        this.array = array;
    }

    public abstract void roll();
}
