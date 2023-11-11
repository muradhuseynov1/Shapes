/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstassignment_rx15mw.RegularShapes;

/**
 *
 * @author huseynov
 */
public class RegularHexagon extends Shape {
    
    public RegularHexagon(String type, double x, double y, double length) {
        super(type, x, y, length);
    }
    
    @Override
    public double getBoundingArea() {
        double height = getLength() * Math.sqrt(3);
        double width = getLength() * 2;
        return height * width;
    }
}