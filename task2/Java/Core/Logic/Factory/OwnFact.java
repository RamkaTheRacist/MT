package MiddleS.task2.Java.Core.Logic.Factory;

import MiddleS.task2.Java.Core.ListOfToys.ListOfToys;
import MiddleS.task2.Java.Core.Logic.Add.AddV1;
import MiddleS.task2.Java.Core.Logic.ChangeDropChance.ChangeDropChanceV1;
import MiddleS.task2.Java.Core.Logic.Interfaces.IConsoleInput;
import MiddleS.task2.Java.Core.Logic.Interfaces.IConsoleOut;
import MiddleS.task2.Java.Core.Logic.Interfaces.IConsoleOutErr;
import MiddleS.task2.Java.Core.Logic.Interfaces.IConsoleOutSuc;
import MiddleS.task2.Java.Core.Logic.Interfaces.IFact;

public class OwnFact implements IFact {

    @Override
    public void makeOperation(String path, String choose, ListOfToys list, IConsoleOutErr err, IConsoleOut output,
            IConsoleOutSuc outSuc, IConsoleInput input) {

        switch (choose) {
            case "Add":
            case "add":
                new AddV1(list, input, outSuc, err).add();
                break;
            case "set":
            case "Set":
                if (list.sizeOfList() == 0) {
                    err.emptyError();
                    return;
                }
                int id = input.setSearchID();
                if (list.ifExist(id)) {
                    new ChangeDropChanceV1(list, input, outSuc, err).change(list.getToy(id));
                    ;
                } else {
                    err.searchError();
                }
                break;
            case "Leave":
                break;
            case "--help":
                output.getHelpOwner();
                break;
            default:
                err.commandError();
                break;
        }
    }

}
