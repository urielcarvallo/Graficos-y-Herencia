package Figura3D;

import Figura2D.Cuadrado;

public class Cubo extends Figura3D{
    private Cuadrado cuadrado;

    public Cubo(){

    }
    public Cubo (String nombre, int grosorBorde, int color, Cuadrado cuadrado){
        super(nombre, grosorBorde, color);
        this.cuadrado = cuadrado;
    }
    public Cuadrado getCuadrado(){
        return cuadrado;
    }
    public void setCuadrado(Cuadrado cuadrado){
        this.cuadrado = cuadrado;
    }

    @Override
    public double calcularVolumen() {
        return Math.pow(cuadrado.getLado(), 3);
    }
    @Override
    public void dibujar(){
        System.out.println("Estoy dibujando..");
    }
    public int cambiarTamanio(){
        int tamanio = 0;
        return tamanio;
    }
    public String toString(){
        return super.toString()+ " Cubo Lado:"+cuadrado.getLado() ;
    }
}