package figura;

import Figura2D.Circulo;
import Figura2D.Cuadrado;
import Figura2D.Triangulo;
import Figura3D.Cubo;
import Figura3D.Esfera;
import Figura3D.Piramide;
import java.util.ArrayList;
import java.util.Iterator;

public class Principal {
    public static void main(String[] args) {
//        Circulo circulo1 = new Circulo("Circulo1", 0, 0, 2);
//        System.out.println("Radio del Circulo: "+circulo1.getRadio());
//        System.out.println("Area del circulo: "+circulo1.calcularArea());
//        System.out.println("======================");
//        Esfera esfera1 = new Esfera("Esfera1", 0, 0, 5);
//        System.out.println("Radio de Esfera: "+esfera1.getRadio());
//        System.out.println("Esfera Volumen: "+esfera1.calcularVolumen());
//        System.out.println("======================");
//        Cuadrado cuadrado1 = new Cuadrado("Cuadrado1", 0, 0, 10);
//        System.out.println("Cuadrado Area: "+cuadrado1.calcularArea());
//        System.out.println("Cuadrado Perimetro: "+cuadrado1.calcularPerimetro());
//        System.out.println("======================");
//        Cubo cubo1 = new Cubo("Cubo1", 0, 0, cuadrado1);
//        System.out.println("Lado del cubo: "+cubo1.getCuadrado().getLado());
//        System.out.println("Cubo Volumen: "+cubo1.calcularVolumen());
//        System.out.println("======================");
//        Triangulo triangulo1 = new Triangulo("Triangulo1", 0, 0, 3, 4);
//        System.out.println("Base: "+triangulo1.getBase() + " Altura: "+triangulo1.getAltura());
//        System.out.println("Triangulo1 Area: "+triangulo1.calcularArea());
//        System.out.println("Triangulo1 Perimetro: "+triangulo1.calcularPerimetro());
//        System.out.println("======================");
//        Piramide piramide1 = new Piramide("Piramide1: ", 0, 0, triangulo1, 5);
//        System.out.println("Lado de la piramide: "+piramide1.getAltura());
//        System.out.println("Piramide Volumen: "+piramide1.calcularVolumen());
//        
//        ArrayList <Figura> array = new ArrayList<>();
//        array.add(cubo1);
//        array.add(cuadrado1);
//        array.add(circulo1);
//        array.add(esfera1);
//        array.add(piramide1);
//        array.add(triangulo1);
//        
//        for (int i = 0; i < array.size(); i++) {
//            System.out.println(array.get(i));
//        }
//        cubo1.dibujar();
//        
        FrameFiguras ff = new FrameFiguras();
        ff.setVisible(true);
        
    }
}