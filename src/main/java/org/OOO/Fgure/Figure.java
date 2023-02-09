package org.OOO.Fgure;

public class Figure {
    private String name;
    private int width;
    private int height;

    public Figure(){

    }

    public Figure(String name, int width, int height) {
        this.name = name;
        if (this.name.equals("square")){
            this.width = width;
            this.height = this.width;
        } else {
            this.width = width;
            this.height = height;
        }
    }

    public void printInfo(){
        System.out.println(this.name + " w= " + this.width + " h= " + this.height);
        System.out.println("Area is = " + areaCalculation());
    }

    public int areaCalculation(int width, int height){

        return width * height;
    }

    public int areaCalculation(){

        return width * height;
    }

    public int perimeterCount(int width, int height){
        return (width + height) * 2;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWidth() {
        System.out.println("Width is = " + width);
        return 0;                                   //for test
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
