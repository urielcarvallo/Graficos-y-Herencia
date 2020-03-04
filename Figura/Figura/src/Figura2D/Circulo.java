package Figura2D;

public class Circulo extends Figura2D{
    private int radio;
    public Circulo(){
        
    }
    public Circulo(String nombre, int grosorBorde, int color, int radio){
        super(nombre, grosorBorde, color);
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }
    public void setRadio(int radio) {
        this.radio = radio;
    }
    
    @Override
    public double calcularArea() {
        return (Math.PI * Math.pow(radio, 2));
    }

    @Override
    public double calcularPerimetro() {
        return (Math.PI * 2 * radio);
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
        return super.toString()+ " Circulo Radio:"+radio;
    }
}