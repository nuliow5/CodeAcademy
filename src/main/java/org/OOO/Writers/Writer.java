package org.OOO.Writers;

import java.time.LocalDate;

public class Writer {
    private int birthDay; //change to LocalDate

    private String favoriteBook;
    public Writer(){

    }

    public Writer(int birthDay, String favoriteBook) {
        this.birthDay = birthDay;
        this.favoriteBook = favoriteBook;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public String getFavoriteBook() {
        return favoriteBook;
    }

    public void setFavoriteBook(String favoriteBook) {
        this.favoriteBook = favoriteBook;
    }
}
