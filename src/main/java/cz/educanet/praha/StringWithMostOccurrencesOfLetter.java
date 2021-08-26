package cz.educanet.praha;

public class StringWithMostOccurrencesOfLetter {

    public static String findStringWithMostOccurrencesOfLetter(String[] strings, char letter) {

        //int[] pocetPismena = new int[strings.length];
        int nejvyssiPocetVyskytu = 0;
        int indexNejvyssiPocet = 0;
        for (int i = 0; i < strings.length; i++){
            String s = strings[i];
            int pocet = 0;
            for (int j = 0; j < s.length(); j++){
                char pismenoStringu = s.charAt(j);
                if (pismenoStringu == letter){
                   pocet++;
               }

            }
            if (pocet > nejvyssiPocetVyskytu){
                nejvyssiPocetVyskytu = pocet;
                indexNejvyssiPocet = i;
            }




        }


        return strings[indexNejvyssiPocet];
    }
}
