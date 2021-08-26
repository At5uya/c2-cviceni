package cz.educanet.praha;

import java.util.Scanner;

public class SumFromZeroTill {
    public static int sumFromZeroTill(int max){
        int soucet = 0;
        for (int x = 1; x <= max; x++ ) {
           soucet += x; }
        return soucet;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        System.out.println(sumFromZeroTill(sc.nextInt()));
    }
}
