package Exercicio3;


import java.util.Scanner;

//3 - Faça um algoritmo que leia dois valores inteiros A e B,
// se os valores de A e B forem iguais, deverá somar os dois valores,
//caso contrário devera multiplicar A por B.
// Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e
//imprimir seu valor na tela.
public class Main {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        int A;
        int B;
        int C;

        System.out.println("inform the value of A: "); // user informs the value of A
        A = sc.nextInt(); // receives and saves the value of A

        System.out.println("inform the value of B: "); // user informs the value of B
        B = sc.nextInt(); // receives and saves the value of B

        if(A == B){ // check if A equals B
            C = A + B; // if A equals B is true, C equals A + B
            System.out.println("the value of C is: " + C); // print C
        }
        else{
            C = A * B; // if A different B, C equals A * B
            System.out.println("the value of C is: " + C); // print C
        }
        sc.close();
    }
}
