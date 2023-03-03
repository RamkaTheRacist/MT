package MiddleS.task2.Java.Core.Logic.SaveToFile;

import java.util.List;

public abstract class SaveBase {
    protected String path;
    protected List<String> array;

    protected SaveBase(String path, List<String> array) {
        this.path = path;
        this.array = array;
    }

    public abstract void save();
}