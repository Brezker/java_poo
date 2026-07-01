package org.brezker;
import java.awt.desktop.SystemEventListener;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 5: ");
        int number = scanner.nextInt();
        switch (number){
            case 1:
                System.out.println("Hoy es lunes");
                break;
            case 2:
                System.out.println("Hoy es martes");
                break;
            case 3:
                System.out.println("Hoy es miercoles");
                break;
            case 4:
                System.out.println("Hoy es jueves");
                break;
            case 5:
                System.out.println("Hoy es viernes");
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }
    }
}
