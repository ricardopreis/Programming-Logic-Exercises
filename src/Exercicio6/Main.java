package Exercicio6;

import java.util.Scanner;

//6 - Faça um algoritmo que leia um valor qualquer
// e imprima na tela com um reajuste de 5%.
public class Main {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("inform the value: "); // user informs the value
        double value = sc.nextDouble(); // receives and saves the value

        double adjustedValue = (value * 1.05); // increase the value with 5%

        System.out.printf("the adjusted value is: %.2f\n", adjustedValue); // print adjusted value
    }
}
