/*
* Esempio molto banale di incapsulamento,ereditarietà e polimorfismo
* */
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a=0,b=0;
	    Rettangolo ret= new Rettangolo(a,b);
        Scanner input = new Scanner(System.in);
	    System.out.print("Inserisci la base: ");
	    a = input.nextInt();
	    ret.setBase(a);
	    System.out.print("Inserisci l'altezza: ");
	    b = input.nextInt();
		ret.setAltezza(b);

		System.out.println("Perimetro del Rettangolo: " + ret.perimetro());
		System.out.println("Area Rettangolo: " + ret.area());

    }
}
