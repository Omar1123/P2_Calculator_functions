/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler;

import Functions.Circle;
import Functions.Square;
import Functions.Triangle;
import java.util.Scanner;

/**
 *
 * @author jake
 */
public class Menu {
 
    private Circle circle;
    private Square square;
    private Triangle triangle;
    
    private int decition;
    private int again;
    
    public Menu() {
        circle = new Circle();
        square = new Square();
        triangle = new Triangle();
    }
    
    private void getInputForCircle() {
        Scanner scannerCircle = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo");
        circle.setRadio(scannerCircle.nextDouble());
    }
    
    private void getInputForTriangle() {
        Scanner scannerTriangle = new Scanner(System.in);
        System.out.println("Ingrese la altura del triangulo");
        triangle.setHeight(scannerTriangle.nextDouble());
        System.out.println("Ingrese la base del triangulo");
        triangle.setBase(scannerTriangle.nextDouble());
    }
    
    private void getInputForSquare() {
        Scanner scannerSquare = new Scanner(System.in);
        System.out.println("Ingrese el lado del cuadrado");
        square.setSide(scannerSquare.nextDouble());
    }
    
    private void showMenu() {
        System.out.println("Funciones trigonometricas");
        System.out.println("1. Circulo:Area");
        System.out.println("2. Circulo:Perimetro");
        System.out.println("3. Cuadrado:Area");
        System.out.println("4. Cuadrado:Perimetro");
        System.out.println("5. Triangulo:Area");
        System.out.println("6. Triangulo:Perimetro");
    }
    
    public void main() {
        
        Scanner scanner = new Scanner(System.in);
        showMenu();
        decition = 0;
        decition = scanner.nextInt();
        
        if(decition == 1) {
            getInputForCircle();
            System.out.println("El area es: " + circle.area());
            otherOperation();
        }
        
        if(decition == 2) {
            getInputForCircle();
            System.out.println("El perimetro es: " + circle.perimeter());
            otherOperation();
        }
        
        if(decition == 3) {
            getInputForSquare();
            System.out.println("El area es: " + square.area());
            otherOperation();
        }
        
        if(decition == 4) {
            getInputForSquare();
            System.out.println("El perimetro es: " + square.perimeter());
            otherOperation();
        }        
        
        if(decition == 5) {
            getInputForTriangle();
            System.out.println("El area es: " + triangle.perimeter());
            otherOperation();
        }
        
        if(decition == 6) {
            getInputForTriangle();
            System.out.println("El perimetro es: " + triangle.perimeter());
            otherOperation();
        }               
    }
    
    private void otherOperation() {
        Scanner scanOperation = new Scanner(System.in);
        again = 0;
        System.out.println("Desea realizar otra operacion(1:si,0:no)");
        again = scanOperation.nextInt();
        
        if(again == 1) {
            main();
        } else {
            System.out.println("Programa finalizado");    
        }
    }
    
}
