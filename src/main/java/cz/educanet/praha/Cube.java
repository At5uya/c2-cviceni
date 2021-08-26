package cz.educanet.praha;

import java.util.Scanner;

public class Cube {
    public static int sumOfAreasAndVolumes(Scanner scanner) {

        int soucet = 0;
       while (scanner.hasNext()) {


           int cislo = scanner.nextInt();
           int povrch = 6*cislo*cislo;
           int obsah = cislo*cislo*cislo;
           soucet += povrch+obsah;
       }
       return soucet;

    }




    public static void main(String[] args) {
        System.out.println(sumOfAreasAndVolumes(new Scanner(System.in)));
    }
}
