package org.Basic.ForTesting.OOOTest;

public class Animal {
    private static int head;
    private static String name;

    public Animal(int head, String name) {
        this.head = head;
        this.name = name;
    }

    public void setHead(int head) {
        this.head = head;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHead() {
        return head;
    }

    public String getName() {
        return name;
    }

    public static void speaking(){
        System.out.println("miau");
        System.out.println("My name is " + name);
        System.out.println("i have " + head + " head");
    }
}
