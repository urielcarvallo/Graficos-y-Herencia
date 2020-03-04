package Figura2D;

public class Triangulo extends Figura2D{
    private int base;
    private int altura;
    
    public Triangulo(){
        
    }
    public Triangulo (String nombre, int grosorBorde, int color, int base, int altura){
        super(nombre, grosorBorde, color);
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }
    public void setBase(int base){
        this.base = base;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura){
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base*altura/2);
    }
    @Override
    public double calcularPerimetro() {
       return (base*3);
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
        return super.toString()+ " Triangulo" + "Base:"+base+" Altura:"+altura ;
    }
}
