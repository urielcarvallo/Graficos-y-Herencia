package Figura3D;

import figura.Figura;


public abstract class Figura3D extends Figura{
    public Figura3D (){
        
    }
    public Figura3D(String nombre, int grosorBorde, int color){
        super(nombre, grosorBorde, color);
    }
    public String toString(){
        return super.toString() + "3D ";
    }
    public abstract double calcularVolumen();
}