package org.OOP.Polimorfizm.TaskSaveInformation;

public class Info {
    private int id;
    private String text;

    public Info(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Info{" +
                "id=" + id +
                ", text='" + text + '\'' +
                '}';
    }

    public boolean doesHave(String word){
        if (word.contains(text)){
            return true;
        } else {
            return false;
        }
    }
}
