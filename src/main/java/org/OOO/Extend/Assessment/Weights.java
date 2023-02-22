package org.OOO.Extend.Assessment;

public class Weights extends Assessment {

    public Weights(int firstGrade, int secondGrade, int thirdGrade) {
        super(firstGrade, secondGrade, thirdGrade);
    }

    @Override
    public int finalScore() {
        return (int) (getFirstGrade() * 0.5 + getSecondGrade() * 0.1 + getThirdGrade() * 0.4);
    }
}
