/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Rectangle {
    
    public static void main(String[] args) {
        // TODO code application logic here
    }

    private double width;
    private double height;
    
    public Rectangle(){
        width = 1;
        height = 1;
    }
    
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    
    double getArea(){
        
        return width * height;
    }
    
    double getPerimeter(){
        
        return 2 * (width + height);
    }
    
}
