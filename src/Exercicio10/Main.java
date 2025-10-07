package Exercicio10;

import java.util.Scanner;

// 10 - Faça um algoritmo que leia três notas obtidas por um aluno
// e imprima na tela a média das notas.
public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("inform first grade: ");// user informs the first grade
        double grade1 = sc.nextDouble();

        System.out.println("inform second grade: ");// user informs the second grade
        double grade2 = sc.nextDouble();

        System.out.println("inform third grade: ");// user informs the third grade
        double grade3 = sc.nextDouble();

        double average = (grade1 + grade2 + grade3) / 3;// sum of grades and division by number of grades for finding the average

        System.out.printf("average of grades is: %.2f ", average );//print the average for user

        }
}