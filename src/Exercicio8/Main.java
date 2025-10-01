package Exercicio8;

import java.util.Arrays;
import java.util.Scanner;

// 8 - Faça um algoritmo que leia três valores inteiros diferentes e
// imprima na tela os valores em ordem decrescente.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inform the first value: "); // user informs the first value
        int value1 = sc.nextInt(); // receives and saves the first value

        System.out.println("Inform the second value: "); // user informs the second value
        int value2 = sc.nextInt(); // receives and saves the second value

        System.out.println("inform the third value: "); // user informs the third value
        int value3 = sc.nextInt(); // receives and saves the third value

        int[] values = {value1, value2, value3}; // creates an array with the three values
        Arrays.sort(values); // sort the array in ascending order

        for (int i = values.length - 1; i >= 0; i--) { // loop to print the values in descending order
            System.out.println(values[i] + ""); // print the values in descending order
        }

    }
}
