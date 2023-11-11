/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstassignment_rx15mw.RegularShapes;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.ArrayList;

/**
 *
 * @author huseynov
 */
public class Main {
    
    static ArrayList<Shape> readFile(String fileName) throws FileNotFoundException, InvalidInputException {
        Scanner scanner = new Scanner(new BufferedReader(new FileReader(fileName)));
        if (!scanner.hasNextLine()) throw new InvalidInputException("File is empty or missing shape count on the first line");
        
        String firstLine = scanner.nextLine();
        String[] tokens = firstLine.trim().split("\\s+");
        
        if (tokens.length != 1) throw new InvalidInputException("Invalid format on the first line: expected single integer");
        
        int number;
        try {
            number = Integer.parseInt(tokens[0]);
        } catch (NumberFormatException e) {
            throw new InvalidInputException("Invalid format on the first line: expected integer value");
        }
    
        ArrayList<Shape> shapes = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            if (!scanner.hasNextLine()) throw new InvalidInputException("Expected more shapes based on the first line count");
            String line = scanner.nextLine();
            tokens = line.split(" ");
            if (tokens.length != 4) throw new InvalidInputException("Invalid format on line: " + line);
    
            char type = tokens[0].charAt(0);
            try {
                double x = Double.parseDouble(tokens[1]);
                double y = Double.parseDouble(tokens[2]);
                double length = Double.parseDouble(tokens[3]);
    
                switch(type) {
                    case 'C' -> shapes.add(new Circle("Circle", x, y, length));
                    case 'S' -> shapes.add(new Square("Square", x, y, length));
                    case 'H' -> shapes.add(new RegularHexagon("Regular Hexagon", x, y, length));
                    case 'T' -> shapes.add(new RegularTriangle("Regular Triangle", x, y, length));
                    default -> throw new InvalidInputException("Invalid shape type: " + type);
                }
            } catch (NumberFormatException e) {
                throw new InvalidInputException("Invalid number format on line: " + line);
            }
        }
        if (scanner.hasNextLine()) throw new InvalidInputException("More shapes in file than specified by the first line count");
        return shapes;
    }              
    
    public static void main(String[] args) {
        try {
            System.out.println("Enter input file name: ");
            String fileName;
            try (Scanner scanner = new Scanner(System.in)) {
                fileName = scanner.nextLine();
            }
            ShapeCollection shapeCol = new ShapeCollection(readFile(fileName));
            System.out.println(shapeCol.greatestArea());
        } catch(FileNotFoundException e) {
            System.out.println("File not found!");
            System.exit(-1);
        } catch(NoSuchElementException e) {
            System.out.println("File is empty or the content is not in correct format");
            System.exit(-1);
        } catch(InvalidInputException e) {
            System.out.println("Invalid input: " + e.getMessage());
            System.exit(-1);
        }
    }
}