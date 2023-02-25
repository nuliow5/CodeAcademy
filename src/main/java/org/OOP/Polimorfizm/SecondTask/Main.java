package org.OOP.Polimorfizm.SecondTask;

public class Main {
    public static void main(String[] args) {

        Draudimas draudimas = new TPVCADraudimas(
                "John Doe",
                1000,
                "ABC123",
                "Lietuva");

        System.out.println(draudimas.getApdraustojoVardas() + " "
                + draudimas.getDraudimoSuma());

        System.out.println(((AutomobilioDraudimas)draudimas).getAutomobilioValstNr());

        System.out.println(((KaskoDraudimas)draudimas).getFransize() + " " +
                ((TPVCADraudimas)draudimas).getGaliojimoTeritorija()
        );

        AutomobilioDraudimas automobilioDraudimas = new KaskoDraudimas(
                "Vardenis",
                500,
                "CCF321",
                100);





    }

}
