package Exercicio7;

import java.util.Scanner;

//7 - Faça um algoritmo que leia dois valores booleanos (lógicos)
// e determine se ambos são VERDADEIRO ou FALSO.
public class Main {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inform the first value: "); // user informs the first value
        boolean value1 = sc.nextBoolean(); // receives and saves the first value

        System.out.println("Inform the second value: "); // user informs the second value
        boolean value2 = sc.nextBoolean(); // receives and saves the second value

        if(value1 && value2){ // check if both values are true
            System.out.println("Both values are TRUE"); // if both values are true
        }
        else if (!value1 && !value2){ // check if both values are false
            System.out.println("Both values are FALSE"); // if both values are false
        }else System.out.println("value are different"); // if one value is true and the other is false
        sc.close();
    }
}
