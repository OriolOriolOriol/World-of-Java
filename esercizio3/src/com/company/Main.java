/*
* Gestione di 2 figure e calcolo dei relativi perimetri e aree. Semplificato!!
* */
package com.company;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        double base=0,altezza=0,baseM=0,lato1=0,lato2=0;
        String scelta="";
        Scanner input = new Scanner(System.in);
        Rettangolo ret = new Rettangolo(base,altezza);
        Trapezio tra = new Trapezio(base,altezza,baseM,lato1,lato2);
        System.out.print("Quale figura scegli per calcolare perimetro e area?: ");
        scelta=input.next();
        try {
            if (scelta.contentEquals("Rettangolo") || scelta.contentEquals("rettangolo")) {
                System.out.println("Hai scelto il rettangolo");
                System.out.print("Inserisci la base del rettangolo: ");
                base = input.nextDouble();
                ret.setBase(base);
                System.out.print("Inserisci l'altezza del rettangolo: ");
                altezza = input.nextDouble();
                ret.setAltezza(altezza);
                System.out.println("Perimetro del Rettangolo: " + ret.perimetro());
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Area Rettangolo: " + ret.area());
                TimeUnit.SECONDS.sleep(1);
            } else if (scelta.contentEquals("Trapezio") || scelta.contentEquals("trapezio")) {
                System.out.println("Hai scelto il Trapezio");
                System.out.print("Inserisci la base minore del trapezio: ");
                base = input.nextDouble();
                tra.setBase(base);
                System.out.print("Inserisci l'altezza del trapezio: ");
                altezza = input.nextDouble();
                tra.setAltezza(altezza);
                System.out.print("Inserisci la base Maggiore del Trapezio: ");
                baseM = input.nextDouble();
                tra.setBaseM(baseM);
                System.out.print("Inserisci il lato 1: ");
                lato1 = input.nextDouble();
                tra.setlato1(lato1);
                System.out.print("Inserisci il lato 2: ");
                lato2 = input.nextDouble();
                tra.setlato2(lato2);
                System.out.println("Perimetro del Trapezio: " + tra.perimetro());
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Area del Trapezio: " + tra.area());
                TimeUnit.SECONDS.sleep(1);
            } else {
                System.out.println("Non ho ancora implementato la sottocalsse per quella figura oppure hai scritto male..");
            }
        }
        catch (NullPointerException exc){
            System.out.println(exc.getMessage());
        }
        catch (ArithmeticException exc){
            System.out.println(exc.getMessage());
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally{
            System.out.println("Il programma ha finito la sua elaborazione..");
        }
    }
}
