package org.Basic.StringLesson.EnumeFirstTask;

public enum UnitOfLength {
    milimetras(1),
    metras(100),
    kilometras(1000000);

    private int matas;

    UnitOfLength(int matas) {
        this.matas = matas;
    }

    public int getMatas() {
        return matas;
    }

    public static int resultMetras(int cm){
        int result = cm / metras.getMatas();

        return result;
    }


}
