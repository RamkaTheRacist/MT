package MiddleS.task2.Java.Core.Logic.Remove;

import MiddleS.task2.Java.Core.ListOfToys.ListOfToys;
import MiddleS.task2.Java.Core.Toy.Toy;

public class RemoveV1 extends RemoveBase {

    public RemoveV1(ListOfToys list) {
        super(list);
    }

    @Override
    public void remove(Toy toy) {
        if (toy.getQuantity() > 1) {
            toy.setQuantity(toy.getQuantity() - 1);
            list.add(toy);
            return;
        }
        list.remove(toy.getId());
    }
}
