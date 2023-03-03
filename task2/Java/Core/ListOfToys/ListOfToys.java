package MiddleS.task2.Java.Core.ListOfToys;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import MiddleS.task2.Java.Core.Toy.Toy;

public class ListOfToys {
    private Map<Integer, Toy> list;

    public ListOfToys() {
        list = new HashMap<>();
    }

    public void add(Toy toy) {
        list.put(toy.getId(), toy);
    }

    public void remove(int id) {
        list.remove(id);
    }

    public boolean ifExist(Toy toy) {
        if (list.containsKey(toy.getId()) || list.containsValue(toy)) {
            return true;
        }
        return false;
    }

    public boolean ifExist(int id) {
        if (list.containsKey(id)) {
            return true;
        }
        return false;
    }

    public int sizeOfList() {
        return list.size();
    }

    public Toy getToy(int id) {
        return list.get(id);
    }

    public List<Toy> values() {
        List<Toy> array = new ArrayList<>();
        for (Toy toy : list.values()) {
            array.add(toy);
        }
        return array;
    }
}