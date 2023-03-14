package org.MyProjects.Bugdet.Simulaion;

import org.MyProjects.Bugdet.records.Budget;
import org.MyProjects.Bugdet.records.Expenses;
import org.MyProjects.Bugdet.records.Income;

import java.time.LocalDate;

public abstract class InputOutputSimulations extends Budget {

    public static void simulationWithRecordsInHash() {
        recordHashMap.put(Income.getId(), new Income(
                4200,
                LocalDate.of(2023, 2, 5),
                "Netflix",
                "Bank", "Full time"));

        recordHashMap.put(Expenses.getId(), new Expenses(
                0,
                85,
                LocalDate.of(2023, 2, 15),
                "BANK",
                "MSI"));

        recordHashMap.put(Expenses.getId(), new Expenses(
                2,
                130,
                LocalDate.of(2023, 2, 13),
                "CASH",
                "LIDL"));

        recordHashMap.put(Expenses.getId(), new Expenses(
                3,
                630,
                LocalDate.of(2023, 2, 10),
                "BANK",
                "-"));

        recordHashMap.put(Expenses.getId(), new Expenses(
                7,
                60,
                LocalDate.of(2023, 2, 11),
                "CASH",
                "-"));

        recordHashMap.put(Expenses.getId(), new Expenses(
                2,
                32,
                LocalDate.of(2023, 2, 13),
                "BANK",
                "Silas"));

        recordHashMap.put(Expenses.getId(), new Expenses(
                6,
                520,
                LocalDate.of(2023, 2, 23),
                "BANK",
                "House credit"));

    }

    public static void simulateWithRecords() {


        records.add(new Income(
                4200,
                LocalDate.of(2023, 2, 5),
                "Netflix",
                "Bank", "Full time "));


        records.add(new Expenses(
                0,
                85,
                LocalDate.of(2023, 2, 15),
                "BANK",
                "MSI"));

        records.add(new Expenses(
                2,
                130,
                LocalDate.of(2023, 2, 13),
                "CASH",
                "LIDL"));

        records.add(new Expenses(
                3,
                630,
                LocalDate.of(2023, 2, 10),
                "BANK",
                "-"));

        records.add(new Expenses(
                7,
                60,
                LocalDate.of(2023, 2, 11),
                "CASH",
                "-"));

        records.add(new Expenses(
                2,
                32,
                LocalDate.of(2023, 2, 13),
                "BANK",
                "Silas"));

        records.add(new Expenses(
                6,
                520,
                LocalDate.of(2023, 2, 23),
                "BANK",
                "House credit"));
    }
}
