package MiddleS.task2.Java.Core.UI;

import MiddleS.task2.Java.Core.ListOfToys.ListOfToys;
import MiddleS.task2.Java.Core.Logic.Factory.MainFact;
import MiddleS.task2.Java.Core.Presenter.Presenter;
import MiddleS.task2.Java.Core.UI.Input.ConsoleInput;
import MiddleS.task2.Java.Core.UI.Output.ConsoleOutErr;
import MiddleS.task2.Java.Core.UI.Output.ConsoleOutSuc;
import MiddleS.task2.Java.Core.UI.Output.ConsoleOutput;
import MiddleS.task2.Java.Core.UI.Output.Menu1;

public class App {
    public void app() {
        ListOfToys list = new ListOfToys();
        String path = "C:\\Users\\where\\Desktop\\Git\\MiddleS\\task2\\Java\\File\\Prizes.txt";
        Presenter pers = new Presenter(path, list, new ConsoleOutErr(), new ConsoleOutput(), new ConsoleOutSuc(),
                new ConsoleInput(),
                new MainFact(), new Menu1());
        pers.doThis();
    }

    public static void main(String[] args) {
        new App().app();
    }
}
