package org.OOO.Extend.Hierarchy;

public class Apple_Antaninis extends Apple{
    protected int pollutionLevel;
    public Apple_Antaninis(int size, String color, String taste, boolean vaccinated, String harvesting, int pollutionLevel) {
        super(size, color, taste, vaccinated, harvesting);

        this.pollutionLevel = pollutionLevel;
    }
}
