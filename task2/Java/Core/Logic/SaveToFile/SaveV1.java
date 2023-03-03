package MiddleS.task2.Java.Core.Logic.SaveToFile;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SaveV1 extends SaveBase {

    public SaveV1(String path, List<String> array) {
        super(path, array);
    }

    @Override
    public void save() {
        try (FileWriter writer = new FileWriter(path, false)) {
            for (String string : array) {
                writer.append(string + "\n");
            }
            writer.flush();
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}