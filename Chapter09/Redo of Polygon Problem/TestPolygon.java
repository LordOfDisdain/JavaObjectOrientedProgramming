/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author student
 */
public class TestPolygon {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Creating the polygon objets
        Polygon regularPolygon = new  Polygon(6, 4);
        
        Polygon regularPolygon2 = new Polygon(10, 4);
        
        Polygon regularPolygon3 = new Polygon(5.6, 7.8);
        
        // Telling the permiter and area for both objects
        System.out.println("The perimeter for this polygon is " + regularPolygon.getPerimeter());
        System.out.println("The area for this polygon is " + regularPolygon.getArea());
        
        System.out.println("The perimeter for this polygon is " + regularPolygon2.getPerimeter());
        System.out.println("The area for this polygon is " + regularPolygon2.getArea());
        
        System.out.println("The perimeter for this polygon is " + regularPolygon3.getPerimeter());
        System.out.println("The area for this polygon is " + regularPolygon3.getArea());
        
        
    }
    
}
