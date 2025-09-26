package Exercicio5;

import java.util.Scanner;

// 5 - Faça um algoritmo que leia o valor do salário mínimo
// e o valor do salário de um usuário, calcule quantos salários mínimos esse
//usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).

public class Main {

    public static void main(String [] args){

    final Double minimumWage = 1293.20; // constant for the value of minimum wage

        Scanner sc = new Scanner(System.in);

        System.out.println("inform your wage : "); // user informs your wage
        double userWage = sc.nextDouble();// receives and saves user wages

        System.out.println("you receive: " + (userWage/minimumWage) +" minimum wages! "); // print the number of minimum
        // wages that the user receives
        sc.close();
    }
}
