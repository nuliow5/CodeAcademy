package org.OOP.Polimorfizm.SecondTask;

public class AutomobilioDraudimas extends Draudimas{
    private String automobilioValstNr;

    public AutomobilioDraudimas(String apdraustojoVardas,double draudimoSuma, String automobilioValstNr) {
        super(apdraustojoVardas, draudimoSuma);
        this.automobilioValstNr = automobilioValstNr;
    }

    public String getAutomobilioValstNr() {
        return automobilioValstNr;
    }

    public void setAutomobilioValstNr(String automobilioValstNr) {
        this.automobilioValstNr = automobilioValstNr;
    }
}
