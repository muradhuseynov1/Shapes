/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstassignment_rx15mw.RegularShapes;

/**
 *
 * @author huseynov
 */
public class RegularTriangle extends Shape {
    
    public RegularTriangle(String type, double x, double y, double length) {
        super(type, x, y, length);
    }
    
    @Override
    public double getBoundingArea() {
        double height = (Math.sqrt(3) / 2) * getLength();
        return getLength() * height;
    }
}