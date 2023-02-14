package org.MyProjects.Bugdet;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Budget {
    private final static String BLACK_WHITE = "\u001B[37m\u001B[40m";
    private final static String YELLOW_BLACK = "\u001B[30m\u001B[43m";
    private final static String LINE = YELLOW_BLACK +"------------------------" +
            "-----------------------------";
    private final static String MAIN_MENU_INFO = BLACK_WHITE + "MAIN MENU\n" +
            "#1 Fill income\n" +
            "#2 Fill expenses\n" +
            "#3 Get budget information\n" +
            "# - press any number for close program";
    private final static String ALL_INCOME_MONEY_INFO = "\u001B[43mAll income money for this month is: %s$\n";
    ArrayList<Income> incomeList = new ArrayList<>();

    private int sumAllIncome;


    Budget(){

    }

    Scanner scanner = new Scanner(System.in);
    private int mainMenu;
    Expenses expenses1 = new Expenses();

    private boolean start = true;

    //Data for Income obj
    private String sourceOfIncome;
    private int incomeMoney;

    //data for date
    private int year, month, day;

    private String[] orderTypeArray = {"CASH", "BANK"};
    private String orderType;

    public void startProgram(){
        while (start){
            System.out.println(MAIN_MENU_INFO);
            mainMenu = scanner.nextInt();

            if (mainMenu < 1 || mainMenu > 3){
                start = false;
            }
            // #1
            if (mainMenu == 1){
                System.out.println(BLACK_WHITE + "Enter source of income [Company name]");
                sourceOfIncome = scanner.next();
                System.out.println(BLACK_WHITE +"Enter income money [$]");
                incomeMoney = scanner.nextInt();
                System.out.println(BLACK_WHITE +"Enter data -> YEAR");
                year = scanner.nextInt();
                System.out.println(BLACK_WHITE +"Enter data -> MONTH");
                month = scanner.nextInt();
                System.out.println(BLACK_WHITE + "Enter data -> DAY");
                day = scanner.nextInt();
                System.out.println(BLACK_WHITE +"Enter order type [cash or bank transfer]\n" +
                        "   #1 -> CASH\n" +
                        "   #2 -> BANK");
                mainMenu = scanner.nextInt();
                // if orderType == 1 or 2
                orderType = orderTypeArray[mainMenu-1];

                incomeList.add(new Income(incomeMoney,
                        LocalDate.of(year, month, day),
                        sourceOfIncome,
                        orderType));


            // #2
            } else if (mainMenu == 2) {
                //

            // #3
            } else if (mainMenu == 3) {
                System.out.println(LINE);
                for (int i = 0; i < incomeList.size(); i++) {
                    incomeList.get(i).printIncomeInfo();
                    sumAllIncome += incomeList.get(i).getIncomeMoney();
                }
                //pinigu suma uz visas pajamas
                System.out.printf(YELLOW_BLACK + ALL_INCOME_MONEY_INFO, sumAllIncome );
                System.out.println(LINE);
            }


        }




    }


}
