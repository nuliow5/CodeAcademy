package org.Basic.Operators;

public enum MenuChose {
    MENU_1("1. Suderis", 1),
    MENU_2("2. Atimti", 2),
    MENU_3("3. Dauginti", 3);

    private String menuText;
    private int menuNumber;

    MenuChose(String menuText, int menuNumber) {
        this.menuText = menuText;
        this.menuNumber = menuNumber;
    }

    public String getMenuText() {
        return menuText;
    }

    public int getMenuNumber() {
        return menuNumber;
    }
}
