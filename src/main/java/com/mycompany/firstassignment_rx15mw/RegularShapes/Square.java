/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstassignment_rx15mw.RegularShapes;

/**
 *
 * @author huseynov
 */
public class Square extends Shape { 
    
    public Square(String type, double x, double y, double length) {
        super(type, x, y, length);
    }
    
    @Override
    public double getBoundingArea() {
        return Math.pow(getLength(), 2);
    }
}
