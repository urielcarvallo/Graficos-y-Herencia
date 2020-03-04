package figura;

import Figura2D.Circulo;
import Figura2D.Cuadrado;
import Figura2D.Triangulo;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class Panel extends JPanel {
    JPanel panel;
    Cuadrado cuadrado;
    Triangulo triangulo;
    Circulo circulo;
    int color;
    
    public Panel(){
        panel = this;
    }
    
    public void setCuadrado(Cuadrado cuadrado, int color){
        this.cuadrado = cuadrado;
        this.color = color;
    }
    public void setTriangulo(Triangulo triangulo, int color){
        this.triangulo = triangulo;
        this.color = color;
    }
    
    public void setCirculo(Circulo circulo, int color){
        this.circulo = circulo;
        this.color = color;
    }

    public void paintComponent(Graphics g){
        //290x280
        
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        if (cuadrado != null){
            g2d.setColor(Color.getColor("Color", color));
            g2d.setStroke(new BasicStroke(cuadrado.getGrosorBorde()));
            g2d.drawRect(50, 50, cuadrado.getLado(), cuadrado.getLado());
        }
        
        if(circulo != null){
            g2d.setColor(Color.getColor("Color", color));
            g2d.setStroke(new BasicStroke(circulo.getGrosorBorde()));
            g2d.drawOval( 50, 50, circulo.getRadio(), circulo.getRadio() );
        }
        
        if (triangulo != null){
            g2d.setColor(Color.getColor("Color", color));
            g2d.setStroke(new BasicStroke(triangulo.getGrosorBorde()));
            g2d.drawLine(30, 30, 30, triangulo.getAltura()+30); //Altura
            g2d.drawLine(30, triangulo.getAltura()+30, triangulo.getBase()+30, triangulo.getAltura()+30); //Base
            g2d.drawLine(30, 30, triangulo.getBase()+30, triangulo.getAltura()+30); //Hipotenusa
        }
        panel.repaint();
        
    }

}