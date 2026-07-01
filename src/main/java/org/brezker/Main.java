package org.brezker;
import java.awt.desktop.SystemEventListener;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt();
        System.out.println("Tu edad es: "+edad);
        if (edad>51){
            System.out.println("Eres adulto mayor");
        } else if (edad>17){
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
    }
}
