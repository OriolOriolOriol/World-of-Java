package com.company;

abstract public class figure_geometriche {
    protected double base;
    protected double altezza;

    figure_geometriche(double base,double altezza){
        setBase(base);
        setAltezza(altezza);
    }

    void setBase(double base){
        this.base=base;
    }

    void setAltezza(double altezza){
        this.altezza=altezza;
    }

    public double getBase(){return this.base;}
    public double getAltezza(){return this.altezza;}

    abstract public double perimetro();
    abstract public double area();
}

class Rettangolo extends figure_geometriche{
    Rettangolo(double base, double altezza) {
        super(base, altezza);
    }

    @Override
    public double perimetro(){ return (getBase()+getAltezza())*2;}

    @Override
    public double area(){return (getBase()*getAltezza()); }


}

class Trapezio extends Rettangolo {
    private double BaseM;
    private double lato1, lato2;

    Trapezio(double base, double altezza, double BaseM, double lato1, double lato2) {
        super(base, altezza);
        setBaseM(BaseM);
        setlato1(lato1);
        setlato2(lato2);
    }

    void setBaseM(double BaseM) {
        this.BaseM = BaseM;
    }

    public double getBaseM() {
        return this.BaseM;
    }

    void setlato1(double lato1) {
        this.lato1 = lato1;
    }

    public double getLato1() {
        return this.lato1;
    }

    void setlato2(double lato2) {
        this.lato2 = lato2;
    }

    public double getLato2() {
        return this.lato2;
    }

    @Override
    public double area() {
        double somma_basi = getBase() + getBaseM();
        final double area_finale = somma_basi * getAltezza() / 2;
        return area_finale;
    }

    @Override
    public double perimetro() {
        return Somma(getBase(), getBaseM(), getLato1(), getLato2());
    }

    public double Somma(double base, double baseM, double lato1, double lato2) {
        int somma = 0;
        somma += base + baseM + lato1 + lato2;
        return somma;
    }
}





