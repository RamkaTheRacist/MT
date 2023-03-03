package MiddleS.task2.Java.Core.Logic.Roll;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import MiddleS.task2.Java.Core.ListOfToys.ListOfToys;
import MiddleS.task2.Java.Core.Logic.Interfaces.IConsoleOut;
import MiddleS.task2.Java.Core.Logic.Interfaces.IConsoleOutErr;
import MiddleS.task2.Java.Core.Logic.Remove.RemoveV1;
import MiddleS.task2.Java.Core.Toy.Toy;

public class RollV1 extends RollBase {

    public RollV1(ListOfToys list, IConsoleOut output, IConsoleOutErr err, List<String> array) {
        super(list, output, err, array);
    }

    @Override
    public void roll() {
        int rollChance = new Random().nextInt(1, 101);
        List<Toy> tmpArray = new ArrayList<>();
        for (Toy toy : list.values()) {
            if (toy.getChanceOfDrop() >= rollChance) {
                tmpArray.add(toy);
            }
        }
        if (tmpArray.size() == 0) {
            err.rollError();
            return;
        }
        Toy[] arr = tmpArray.toArray(new Toy[tmpArray.size()]);
        Toy toy = arr[new Random().nextInt(0, arr.length)];
        array.add(toy.getToyName());
        output.getPrize(toy.getToyName());
        new RemoveV1(list).remove(toy);
    }
}
