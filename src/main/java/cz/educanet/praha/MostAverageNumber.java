package cz.educanet.praha;

import java.util.Scanner;

public class MostAverageNumber {

    static int findMostAverageNumber(Scanner sc) {
        int n = sc.nextInt();
        int[] pole = new int[n];

        for(int i = 0; i < n; i++){
            pole[i] = sc.nextInt();

        }
            double soucet = 0;
            for (int i = 0; i < n; i++){
                soucet += pole[i];


            }
        double prumer = soucet/n;
        int nejblizsiCislo = 0;
        double nejmensiVzdalenost = Double.MAX_VALUE;
        for (int i = 0; i < n; i++){
            double vzdalenost = Math.abs(prumer - pole[i]);
            if (vzdalenost < nejmensiVzdalenost){
                nejmensiVzdalenost = vzdalenost;
                nejblizsiCislo = pole[i];

            }

        }
                return nejblizsiCislo;





    }
}
