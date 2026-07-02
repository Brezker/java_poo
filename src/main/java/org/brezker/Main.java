package org.brezker;
public class Main {
    public static int sumar(int numero1, int numero2){
        int resultado=numero1+numero2;
        return resultado;
    }
    public static void main(String[] args) {
        int resultado = sumar(10,6);
        System.out.println("El resultado es: "+resultado);
    }
}
