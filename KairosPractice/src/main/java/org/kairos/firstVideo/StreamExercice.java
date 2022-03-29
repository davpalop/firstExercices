package org.kairos.firstVideo;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamExercice {

    static List<Integer> intList = new ArrayList<Integer>(Arrays.asList(30, 8, 2, 3, 6, 21, 300, 201,8, 12, 11));

    public static void main(String[] args) {
        counterOver10WithStream(intList);
        counterOver10WithouthStream(intList);
    }

    private static String counterOver10WithouthStream(List<Integer> list) {
        int countOdds = 0;
        int countEvens = 0;

        for (int i =0; i < list.size(); i++) {
                int num = intList.get(i);
                if (num>=10) {
                    if (num % 2 == 0) {
                        countOdds += num;
                    }
                    if (num % 2 != 0) {
                        countEvens += num;
                    }
                }

        }

        String result = "Los pares mas grandes de 10 sumados son " + countOdds + " y los impares son " + countEvens;
        System.out.println(result);
        return result;
    }

    public static String counterOver10WithStream(List<Integer> list) {

        int sumOver10Pairs = intList.stream()
                .filter(Integer -> Integer >= 10 && Integer % 2 == 0)
                .reduce(0, Integer::sum);

        int sumOver10Evens = intList.stream()
                .filter(Integer -> Integer >= 10 && Integer % 2 != 0)
                .reduce(0, Integer::sum);

        String result = "Los pares mas grandes de 10 sumados son " + sumOver10Pairs + " y los impares son " + sumOver10Evens;
        System.out.println(result);
        return result;
    }
}
