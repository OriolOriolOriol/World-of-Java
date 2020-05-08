package com.company;

public class figure {

    private int a;
    private int b;

    //Metodo costruttore che invoca i metodi setter
     public figure(int a, int b){
         setA(a);
         setB(b);
     }

       public void setA(int a){
           this.a=a;
       }

       public void setB(int b){
           this.b=b;
       }

       public int getA(){
         return this.a;
       }

       public int getB(){
         return this.b;
       }
       //Guarda come usi l'incapsulamento usando i metodi get e set
        public int get_esempio_somma(){
            var i = getA() + getB();
            return i;
        }
}
