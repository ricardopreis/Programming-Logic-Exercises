package Exercicio4;


import java.util.Scanner;

//4 - Faça um algoritmo que receba um número inteiro e
// imprima na tela o seu antecessor e o seu sucessor.
public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("inform the value: "); // user informs the value
        int value = sc.nextInt(); // receives and saves the value

        System.out.println("subsequent number: " + (value + 1)); // subsequent number
        System.out.println("predecessor number: " + (value -1)); // predecessor number

        sc.close();
    }

}
