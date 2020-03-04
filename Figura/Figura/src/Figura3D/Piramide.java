package Figura3D;

import Figura2D.Triangulo;

public class Piramide extends Figura3D{
    private int altura;
    private Triangulo triangulo;
    
    public Piramide(){
        
    }
    public Piramide(String nombre, int grosorBorde, int color, Triangulo triangulo, int altura){
        super(nombre, grosorBorde, color);
        this.triangulo = triangulo; this.altura = altura;
    }

    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public Triangulo getTriangulo() {
        return triangulo;
    }
    public void setTriangulo(Triangulo triangulo) {
        this.triangulo = triangulo;
    }
    
    @Override
    public double calcularVolumen() {
        return ( Math.pow(altura, 3) * Math.pow(2,  2) / 12 ) ;
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
        return super.toString()+ " Piramide Altura"+altura ;
    }
}