package cz.educanet.praha;

import java.util.Scanner;

public class PrintedSquare {
    public static String printSquare(int side) {
    String txt = "";
    for (int i = 0; i < side; i++){
        txt += "*";
     }
    txt += "\n";
    for (int i = 1; i < side - 1; i++){
        for (int j = 0; j < side; j++){
            if (j == 0 || j == side -1){
                txt += "*";

            }
            else {txt += " ";};
        }
        txt += "\n";
    }
        for (int i = 0; i < side; i++){
            txt += "*";
        }




    return txt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the square's side");
        String result = printSquare(sc.nextInt());
        System.out.println(result);
    }
}
