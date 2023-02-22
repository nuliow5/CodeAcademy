package org.TrainingInFreeTime.Kata.Kata02_20;

import java.util.ArrayList;

public class MondayKata {
    public static void main(String[] args) {
        ArrayList<Integer> fibonacciFollow = new ArrayList<>();
        fibonacciFollow.add(1);
        fibonacciFollow.add(2);

        sumFibonacci(fibonacciFollow, 6);
        System.out.println(fibonacciFollow);

    }

    public static void sumFibonacci(ArrayList<Integer> fibonacciFollow, int inputValue){
        int sum = 0;
        for (int i = 2; i < inputValue; i++) {
            fibonacciFollow.add(fibonacciFollow.get(i-2) + fibonacciFollow.get(i-1));
            if (inputValue <= fibonacciFollow.get(i)){
                break;
            }
        }

        for (int i = 0; i < fibonacciFollow.size(); i++) {
            if (inputValue > fibonacciFollow.get(i)){
                sum += fibonacciFollow.get(i);
            }
        }
        System.out.println("sum is = " + sum);
    }
}
