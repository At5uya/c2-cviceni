package cz.educanet.praha;

import java.util.Scanner;

public class Cinema {

    public static int freeSpaces(String[] namesOnSeat, Scanner sc) {

        while (sc.hasNext()){
            int cisloSedadla;

            /*
            do  {
            cisloSedadla = sc.nextInt();

            if(cisloSedadla < 0|| cisloSedadla >= namesOnSeat.length){
                continue;
            }

            }while( namesOnSeat[cisloSedadla]!= null);

             */

            while(true)  {

                cisloSedadla = sc.nextInt();

                if(cisloSedadla >= 0 && cisloSedadla < namesOnSeat.length && namesOnSeat[cisloSedadla]== null){
                   break;
                }

            }           


            String jmeno = sc.next();
            namesOnSeat[cisloSedadla] = jmeno;

        }
        int pocet = 0;
        for (int i = 0; i < namesOnSeat.length; i++){
        if (namesOnSeat[i]== null){
            pocet++;

        }


        }
        return pocet;


    }

    public static void main(String[] args) {
        int freeSpaces = freeSpaces(new String[]{null, null, "2bad2furious", null, null, "monarezio"}, new Scanner(System.in));
        System.out.println("Free spaces: " + freeSpaces);
    }
}
