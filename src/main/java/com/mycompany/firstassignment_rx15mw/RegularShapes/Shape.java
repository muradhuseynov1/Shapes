/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstassignment_rx15mw.RegularShapes;

/**
 *
 * @author huseynov
 */
public abstract class Shape {
    private final double x;
    private final double y;
    private double length;
    private String type;
    
    public Shape(String type, double x, double y, double length){
        this.type = type;
        this.x = x;
        this.y = y;
        this.length = length;
    }
    
    public String getType() {
        return type;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getLength() {
        return length;
    }
    
    public abstract double getBoundingArea();
    
    @Override
    public String toString() {
        return """
               Details of the shape with the greatest bounding box area:
               Type: """ + type + ", center coordinate: (" + x + y + "), length: " + length;
    }
}