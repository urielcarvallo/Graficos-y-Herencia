package Figura2D;

import Figura2D.Figura2D;

public class Cuadrado extends Figura2D{
    private int lado;

    public Cuadrado(){
        
    }
    public Cuadrado (String nombre, int grosorBorde, int color, int lado){
        super(nombre, grosorBorde, color);
        this.lado = lado;
    }
    public int getLado(){
        return lado;
    }
    public void setLado (int lado){
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return Math.pow(lado, 2);
    }

    @Override
    public double calcularPerimetro() {
        return lado*4;
    }
    public void dibujar(){
        System.out.println("dibujoooo");
    }
    public int cambiarTamanio(){
        int tamanio = 0;
        return tamanio;
    }
    public String toString(){
        return super.toString()+ " Cuadrado Lado"+lado;
    }
}
