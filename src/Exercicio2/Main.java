package Exercicio2;

import java.util.Scanner;

//2 - Faça um algoritmo para receber um número qualquer
// e imprimir na tela se o número é par ou ímpar, positivo ou negativo.
public class Main {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("inform a value : "); // user informs the value
        int value = sc.nextInt(); // receives and saves the value

        if (value % 2 == 0 ){ // check if the value is even or odd
            System.out.println("the number is even"); // if value is even
        }
        else{
            System.out.println("the number is odd"); // if value is odd
        }
        if(value < 0){ // check if the value is positive or negative
            System.out.println("the number is negative"); // if value is negative
        }
        else{
            System.out.println("the number is positive"); // if value is positive
        }
        sc.close();

    }
}
