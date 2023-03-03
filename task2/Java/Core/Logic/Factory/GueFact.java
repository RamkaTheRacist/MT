package MiddleS.task2.Java.Core.Logic.Factory;

import java.util.ArrayList;
import java.util.List;

import MiddleS.task2.Java.Core.ListOfToys.ListOfToys;
import MiddleS.task2.Java.Core.Logic.Interfaces.IConsoleInput;
import MiddleS.task2.Java.Core.Logic.Interfaces.IConsoleOut;
import MiddleS.task2.Java.Core.Logic.Interfaces.IConsoleOutErr;
import MiddleS.task2.Java.Core.Logic.Interfaces.IConsoleOutSuc;
import MiddleS.task2.Java.Core.Logic.Interfaces.IFact;
import MiddleS.task2.Java.Core.Logic.Roll.RollV1;
import MiddleS.task2.Java.Core.Logic.SaveToFile.SaveV1;

public class GueFact implements IFact {
    List<String> array = new ArrayList<>();

    @Override
    public void makeOperation(String path, String choose, ListOfToys list, IConsoleOutErr err, IConsoleOut output,
            IConsoleOutSuc outSuc, IConsoleInput input) {

        switch (choose) {
            case "Roll":
            case "roll":
                if (list.sizeOfList() > 0) {
                    outSuc.rollSuc();
                    new RollV1(list, output, err, array).roll();
                } else {
                    err.emptyError();
                }
                break;
            case "Leave":
                new SaveV1(path, array).save();
                break;
            case "--help":
                output.getHelpGuest();
                break;
            default:
                err.commandError();
                break;
        }

    }
}