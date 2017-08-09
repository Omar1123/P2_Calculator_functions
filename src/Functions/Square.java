/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Functions;

/**
 *
 * @author jake
 */
public class Square {
    
    private double result;
    private double side;
    
    public void setSide(double side) {
        this.side = side;
    }
    
    public double getSide() {
        return side;
    }
    
    public double area() {
        result = 0;
        result = Math.pow(side, 2); 
        return result;
    }
    
    public double perimeter() {
        result = 0;
        result = side * 4;
        return result;
    }
    
    public Square(double side) {
        this.side = side;
    }
    
    public Square() {
        side = 0;
    }
}
