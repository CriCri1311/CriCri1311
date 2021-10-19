package OperacionesyValores;

import java.util.Scanner;

public class Ejercicio7Valores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minutos = sc.nextInt();//Ejemplo 1000
        int horas = minutos / 60;
        int resto = minutos % 60; //puedes poner en vez de int minutos = minutos % 60;
        System.out.println("En " + minutos + " minutos hay " + horas + " horas y " + resto + " minutos");
        
        System.out.println("Esto es un cambio");
    }


}
