package org.OOP.Polimorfizm.TaskSaveInformation;


public class ProgramMain {
    static DataBase dataBase = new DataBase();
    static RemoteDisk remoteDisk = new RemoteDisk();

    public static void main(String[] args) {

        Info info1 = new Info(11, "Eleven");
        Info info2 = new Info(22, "Twenty two");
        Info info3 = new Info(33, "Thirty three");
        Info info4 = new Info(111, "Storage folder <111>");
        Info info5 = new Info(222, "Storage folder <222>");
        Info info6 = new Info(333, "Storage folder <333>");


        save(dataBase, info1);
        save(dataBase, info2);
        save(dataBase, info3);

        save(remoteDisk, info4);
        save(remoteDisk, info5);
        save(remoteDisk, info6);

        findById(dataBase, 22);
        findById(dataBase, 23); //null
        findById(remoteDisk, 222);

        findByWord(dataBase, "Twenty two");
        findByWord(dataBase, "Twenty"); //null



    }

    public static void save(Storage storage, Info info) {
        storage.saveInfo(info);
    }

    public static void findById(Storage storage, int id) {
        storage.findInfo(id);
    }

    public static void findByWord(Storage storage, String word) {
        storage.findInfo(word);
    }
}
