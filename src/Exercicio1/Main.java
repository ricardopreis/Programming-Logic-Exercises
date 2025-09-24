package Exercicio1;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// 1 - Faça um algoritmo que leia os valores de A, B, C e em seguida
// imprima na tela a soma entre A e B é mostre se a soma é menor que C.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("inform the value (a) : ");// User inform the value A
        int a = sc.nextInt(); // Receives and saves the value A provided by the user

        System.out.println("inform the value (b) : ");// idem but value now is B
        int b = sc.nextInt(); // idem but value now is B

        System.out.println("inform the value (c) : ");// idem but value now is C
        int c = sc.nextInt(); // idem but value now is C

        int sum = a + b; // sum of values A and B


        if(sum < c){ // check if sum of values A and B less than C
            System.out.println("sum of values less than: " + c); // if the sum of values is less than C
        }
        else{
            System.out.println("sum of values greater than: " + c); // if the sum of values is greather than C
        }
        sc.close();
    }
}