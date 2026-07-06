package org.brezker;

import java.util.Scanner;

public class Main {
    public static void saludar(){
        System.out.println("Hola");
    }
    public static int sumar(int numero1, int numero2){
        return numero1+numero2;
    }
    public static boolean esPar(int num){
        return num%2==0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opc=0;
        do {
            System.out.println("1. Saludar");
            System.out.println("2. Sumar");
            System.out.println("3. Par impar");
            System.out.println("4. Salir");
            System.out.println("Ingrese una opcion.");
            opc=scanner.nextInt();
            switch (opc){
                case 1:
                    saludar();
                    break;
                case 2:
                    System.out.println(sumar(1,19));
                    break;
                case 3:
                    System.out.println(esPar(48));
                    break;
                case 4:
                    System.out.println("Gracias por usar el sistema!");
                    break;
                default:
                    System.out.println("No aplica esta opcion");
                    break;
            }
        }while (opc!=4);
    }
}
