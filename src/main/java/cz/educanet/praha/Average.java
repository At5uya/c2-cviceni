package cz.educanet.praha;

import java.util.Scanner;

public class Average {



    public static double average(Scanner scanner) {

       double soucet = 0;
       int pocet = 0;
       while (scanner.hasNext()){
           soucet += scanner.nextInt();
           pocet++;

       }
        double prumer = soucet/pocet;

        return prumer;
       }


    public static void main(String[] args) {
        System.out.println(average(new Scanner(System.in)));
    }
}
