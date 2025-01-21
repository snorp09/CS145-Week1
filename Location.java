// Name: Christopher Waschke, Jackson Jenks, Brody Weinkauf
// Assignment: Week 1 - OOP
// Purpose: Find location in double 2d array of largest value.
// Citation: Class Lectures 1/13/2025, 1/14/2025, 1/15/2025

// Location Manager Class
// Wraps our methods for interacting with our Location data class.


public class Location {

    //initialization of variables
    private int row = 0;
    private int column = 0;
    private double maxValue = 0;

    //getter method that pulls the current row
    public int getRow() {

        return this.row;

    }

    //getter method that pulls the current column
    public int getColumn() {

        return this.column;

    }

    //getter method that pulls the current max value
    public double getMaxValue() {

        return this.maxValue;

    }

    //setter method that equates the new row to the current row
    public void setRow(int newRow) {

        this.row = newRow;
    
    }
    
    //setter method that equates the new column to the current column
    public void setColumn(int newColumn) {

        this.column = newColumn;
    
    }

    //setter method that equates the new max value to the current max value
    public void setMaxValue(double newMaxValue) {

        this.maxValue = newMaxValue;
    
    }

    //constructor
    public Location() {

    }

}