package org.OOP.Polimorfizm.TaskSaveInformation;

public interface Storage {
    void saveInfo(Info info);

    Info findInfo(int id);

    Info findInfo(String word);
}
