package org.MyProjects.Bugdet.ForTest;

import java.math.BigDecimal;

public class Islaidos {
    private BigDecimal money;

    public Islaidos(BigDecimal money) {
        this.money = money;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }
}
