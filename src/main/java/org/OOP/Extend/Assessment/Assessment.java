package org.OOP.Extend.Assessment;

public abstract class Assessment {
    private final int firstGrade;
    private final int secondGrade;
    private final int thirdGrade;

    public Assessment(int firstGrade, int secondGrade, int thirdGrade) {
        this.firstGrade = firstGrade;
        this.secondGrade = secondGrade;
        this.thirdGrade = thirdGrade;
    }

    public abstract int finalScore();

    public int getFirstGrade() {
        return firstGrade;
    }

    public int getSecondGrade() {
        return secondGrade;
    }

    public int getThirdGrade() {
        return thirdGrade;
    }
}

