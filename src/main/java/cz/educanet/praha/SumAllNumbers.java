package cz.educanet.praha;

import java.util.Scanner;

public class SumAllNumbers {

    public static int calculate(Scanner scanner) {

        int soucet = 0;
        while (scanner.hasNext())
        soucet += scanner.nextInt();
        return soucet;






    }

    public static void main(String[] args) {
        System.out.println(calculate(new Scanner(System.in)));
    }
}
