package Figura3D;

public class Esfera extends Figura3D{
    private int radio;
    
    public Esfera(){

    }
    public Esfera(String nombre, int grosorBode, int color,  int radio){
        super(nombre, grosorBode, color);
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }
    public void setRadio(int radio) {
        this.radio = radio;
    }
    
    @Override
    public double calcularVolumen() {
        return (4/3 * Math.PI * Math.pow(radio, 3));
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
        return super.toString()+ " Esfera Radio"+radio ;
    }
}