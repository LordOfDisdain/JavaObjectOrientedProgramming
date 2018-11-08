/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import javax.print.attribute.standard.*;

/**
 *
 * @author student
 */
public class Polygon {
    
    private double n = 3;
    private double Sides = 1;
    private double x = 0;
    private double y = 0;
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    double getN(){
        return n;
    }
    public Polygon(){
        n = 1;
        Sides = 1;
    }
    public Polygon(double n, double Sides){
        this.n = n;
        this.Sides = Sides;
    }
    
    double getSides(){
        return Sides;
    }
    
    double getX(){
        return x;
    }
    
    double getY(){
        return y;
    }
    
    double setN(){
        return n;
    }
    
    double setSides(){
        return Sides;
    }
    
    double setX(){
        return x;
    }
    
    double setY(){
        return y;
    }
    
    
    double getPerimeter(){
        return 2 * (n + Sides);
    }
    
    double getArea(){
        double area;
        area = ((n * Math.pow(Sides, 2)) / (4 * Math.tan(3.14 / n)));
        return area;
    }
}
