package com.company;

abstract public class Figure {
    protected int base =0;
    protected int altezza =0;

    public Figure (int base, int altezza){

        setBase(base);
        setAltezza(altezza);
    }

    void setBase(int base){
        this.base=base;
    }

    void setAltezza(int altezza){
        this.altezza=altezza;
    }

     public int getBase(){
        return this.base;
     }

     public int getAltezza(){
        return this.altezza;
     }

    abstract int perimetro();
    abstract int area();
}


class Rettangolo extends Figure{ //la classe rettangolo deve implementare i metodi abstract della classe madre

    public Rettangolo (int base,int altezza){
        super(base,altezza);
    }
    @Override
    public int perimetro() { return (base+altezza)*2; }

    @Override
    public int area() { return (base*altezza); }
}

