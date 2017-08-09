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
public class Triangle {
    
    private double height;
    private double base;
    private double result;
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setBase(double base) {
        this.base = base;
    }
    
    public double getBase() {
        return base;
    }
    
    public double area() {
        result = 0;
        result = base * height;
        return result;
    }
    
    public double perimeter() {
        result = 0;
        result = base + height;
        result = result * 2;
        return result;
    }
    
    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }
    
    public Triangle() {
        height = 0;
        base = 0;
    }
}
