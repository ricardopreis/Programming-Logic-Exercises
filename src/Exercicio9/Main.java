package Exercicio9;

//9 - Faça um algoritmo que calcule o IMC (Índice de Massa Corporal)
// de uma pessoa, leia o seu peso e sua altura e imprima na tela sua condição
//de acordo com a tabela abaixo:

//Fórmula do IMC = peso / (altura) ²

//Tabela Condições IMC

// Abaixo de 18,5   | Abaixo do peso
// Entre 18,6 e 24,9 | Peso ideal (parabéns)
// Entre 25,0 e 29,9 | Levemente acima do peso
// Entre 30,0 e 34,9 | Obesidade grau I
// Entre 35,0 e 39,9 | Obesidade grau II (severa)
// Maior ou igual a 40 | Obesidade grau III (mórbida)

import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("inform your weight:" );// users prompt your weight
        double weight = sc.nextDouble();// receives and saves the weight

        System.out.println("inform your height:" );// users prompt your height
        double height = sc.nextDouble();//receives and saves the height

        double highHeight = Math.pow(height, 2.00);// raises the weight
        double imc = weight / highHeight;// calculate imc

        if(imc <= 18.5){//check if IMC is minor of 18,5
            System.out.println("underweight, your imc is: " + imc);// underweight
        } else if (imc <= 24.9 ) {//check if IMC is minor of 24,9
            System.out.println("light underweight, your imc is: " + imc);// light underweight
        } else if (imc <= 29.9) {//check if IMC is minor of 29,9
            System.out.println("ideal weight, your imc is: " + imc);//ideal weight
        } else if (imc <= 34.9) {//check if IMC is minor of 34,9
            System.out.println("obesity, grade I, your imc is: " + imc);//obesity, grade I
        } else if (imc <= 39.9) {//check if IMC is minor of 39,9
            System.out.println("obesity, grade II, your imc is: " + imc);//obesity, grade II (severe)
        } else if (imc > 40) {//check if IMC is major of 40
            System.out.println("obesity, grade III, your imc is: " + imc);//obesity, grade III (morbid)
        }


    }
}
