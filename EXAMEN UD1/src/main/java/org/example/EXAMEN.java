package org.example;

import java.util.Scanner;
import java.util.InputMismatchException;

public class EXAMEN {

    public void ejercicio1(){

        Scanner entrada = new Scanner(System.in);


        System.out.println("Introduce la nota del primer trimestre (0-10)");

        float num1;
        num1 = entrada.nextInt();
        System.out.println("Introduce la nota del segundo trimestre (0-10)");
        float num2;
        num2 = entrada.nextInt();
        System.out.println("Introduce la nota del tercer trimestre (0-10)");
        float num3;
        num3 = entrada.nextInt();

        float resultado;
        float resultado1;
        resultado = num1 + num2 + num3 ;
        resultado1 = resultado / 3;
        System .out.println("La media obtenida es" + resultado);


        if (resultado1>=5){
            System.out.println("Aprobado");
        }else {
            System.out.println("Suspendido");
        }




    }

    public void ejercicio2(){

        Scanner entrada = new Scanner(System.in);

        int num = 0;
        boolean error = true;

        while (error==true) {

            try {
                System.out.println("Introduce un numero");
                num = entrada.nextInt();
                error = false;
            } catch (InputMismatchException er) {
                System.out.println("ERROR. Introduce un valor valido...");
                entrada.nextLine();
            }
        }


        if (num<0){
            num = num * (-1);
            System.out.println("El valor absoluto es "+num);

        }else {
            System.out.println("El valor absoluto es "+num);
        }
    }
}
