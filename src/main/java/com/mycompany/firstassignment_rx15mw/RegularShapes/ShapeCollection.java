/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstassignment_rx15mw.RegularShapes;

import java.util.ArrayList;

/**
 *
 * @author huseynov
 */
public class ShapeCollection {
    
    private final ArrayList<Shape> shapes;
    
    public ShapeCollection(ArrayList<Shape> shapes) {
        this.shapes = new ArrayList<>(shapes);
    }
    
    public String greatestArea() {
        Shape greatestShape = shapes.get(0);
        for(Shape shape : shapes) {
            if(shape.getBoundingArea() > greatestShape.getBoundingArea()) {
                greatestShape = shape;
            }
        }
        return greatestShape.getType();
    }
}