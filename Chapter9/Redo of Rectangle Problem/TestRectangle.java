/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author student
 */
public class TestRectangle {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Rectangle zRectangle = new Rectangle(4, 40);
        Rectangle zRectangle2 = new Rectangle(3.5, 35.9);
        
        System.out.println("The area for Rectangle one is " + zRectangle.getArea());
        System.out.println("The perimeter for Rectangle one is " + zRectangle.getPerimeter());
        
        System.out.println("The area for Rectangle two is " + zRectangle2.getArea());
        System.out.println("The perimeter for Rectangle two is " + zRectangle2.getPerimeter());
        
    }
    
    
}
