package MiddleS.task2.Java.Core.Logic.Interfaces;

import MiddleS.task2.Java.Core.ListOfToys.ListOfToys;

public interface IFact {
    void makeOperation(String path, String choose, ListOfToys list, IConsoleOutErr err, IConsoleOut output,
            IConsoleOutSuc outSuc, IConsoleInput input);
}