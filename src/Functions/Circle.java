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
public class Circle {
    
    private double radio;
    private double result;
    
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double getRadio() {
        return radio;
    }
    
    public double area() {
        result = 0;
        result = Math.PI * Math.pow(radio, 2);
        return result;
    }
    
    public double perimeter() {
        result = 0;
        result = 2 * Math.PI * radio;
        return result;
    }
    
    public Circle(double radio) {
        this.radio = radio;        
    }
    
    public Circle() {
        radio = 0;
    }
    
}
