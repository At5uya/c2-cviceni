package cz.educanet.praha;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumSumsOfEvenAndMultipleOfOdd {

    public static int sumSumsOfEvenAndMultipleOfOdd(Scanner scanner) {
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();
        while (scanner.hasNext()){
            int number = scanner.nextInt();
            if (number%2==0){
                evenNumbers.add(number);
            }
            else{
                oddNumbers.add(number);
            }
        }
        int sumEvenNumbers = 0;
        for (int i = 0; i < evenNumbers.size(); i++){
            sumEvenNumbers += evenNumbers.get(i);
        }
        int multiply = 1;
        for (int i = 0; i < oddNumbers.size(); i++){
            multiply *= oddNumbers.get(i);
        }
        return sumEvenNumbers + multiply;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number separated by a new line");
        System.out.println(sumSumsOfEvenAndMultipleOfOdd(sc));
    }
}
