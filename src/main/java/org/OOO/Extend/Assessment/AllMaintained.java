package org.OOO.Extend.Assessment;

public class AllMaintained extends Assessment{
    public AllMaintained(int firstGrade, int secondGrade, int thirdGrade) {
        super(firstGrade, secondGrade, thirdGrade);
    }

    @Override
    public int finalScore() {
        if (getFirstGrade() > 4 && getSecondGrade() > 4 && getThirdGrade() > 4){
            return (getFirstGrade() + getSecondGrade() + getThirdGrade()) / 3;
        } else {
            return 0;
        }
    }
}
