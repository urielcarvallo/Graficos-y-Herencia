package Figura2D;

import figura.Figura;

public abstract class Figura2D extends Figura{
    public Figura2D(){
        
    }
    public Figura2D(String nombre, int grosorBorde, int color){
        super(nombre, grosorBorde, color);
    }
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
    public String toString(){
        return super.toString()+ " 2D" ;
    }
    public abstract void dibujar();
}