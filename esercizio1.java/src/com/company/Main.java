/*
* Primo esempio in Java con l'uso molto banale dell'incapsulamento in Java facendo la somma di due numeri
* */
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int var1 = 0;
        int var2=0;
        figure f1= new figure(var1,var2);
        Scanner input= new Scanner (System.in);
        System.out.print("Inserisci valore a: ");
        var1=input.nextInt();
        f1.setA(var1);
        System.out.println("\n");
        System.out.print("Inserisci valore di b: ");
        var2 = input.nextInt();
        f1.setB(var2);
        System.out.println("\n");
        int somma= f1.get_esempio_somma();
        System.out.println("Somma finale tra due numeri: " + somma);



    }
}
