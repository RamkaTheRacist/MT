package MiddleS.task2.Java.Core.Logic.Factory;

import MiddleS.task2.Java.Core.ListOfToys.ListOfToys;
import MiddleS.task2.Java.Core.Logic.Interfaces.IConsoleInput;
import MiddleS.task2.Java.Core.Logic.Interfaces.IConsoleOut;
import MiddleS.task2.Java.Core.Logic.Interfaces.IConsoleOutErr;
import MiddleS.task2.Java.Core.Logic.Interfaces.IConsoleOutSuc;
import MiddleS.task2.Java.Core.Logic.Interfaces.IFact;
import MiddleS.task2.Java.Core.Presenter.Presenter;
import MiddleS.task2.Java.Core.UI.Output.Menu2;
import MiddleS.task2.Java.Core.UI.Output.Menu3;

public class MainFact implements IFact {

    @Override
    public void makeOperation(String path, String choose, ListOfToys list, IConsoleOutErr err, IConsoleOut output,
            IConsoleOutSuc outSuc, IConsoleInput input) {
        switch (choose) {
            case "Owner":
            case "owner":
                new Presenter(path, list, err, output, outSuc, input, new OwnFact(), new Menu2()).doThis();
                break;
            case "Guest":
            case "guest":
                new Presenter(path, list, err, output, outSuc, input, new GueFact(), new Menu3()).doThis();
                break;
            case "--help":
                output.getHelpMain();
                break;
            case "Leave":
                break;
            default:
                err.commandError();
                break;
        }
    }

}
