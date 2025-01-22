// Name: Christopher Waschke, Jackson Jenks, Brody Weinkauf
// Assignment: Week 1 - OOP
// Purpose: Find location in double 2d array of largest value.
// Citation: Class Lectures 1/13/2025, 1/14/2025, 1/15/2025

// Location Manager Class
// Wraps our methods for interacting with our Location data class.

// For extra credit, we used the package keyword to combine our classes.

package src.Location;
import java.util.Scanner;

class Location {

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

class LocationManager {
    
    /*
     * static void method, find the largest double within a 2d double array.
     * Returns the largest double with XY cordinates wrapped within a Location Class.
     * Parameters:
     *  valueGrid (2d Double Array): our 2d array that we're looking for the largest value in.
     */
    public static Location locateLargest(double[][] valueGrid){
        
        // Create our empty location object.
        Location largest = new Location();
        
        // Loop through each entry in our array.
        for(int row = 0; row < valueGrid.length; row++){
            for(int column = 0; column < valueGrid[row].length; column++){

                // If the value found at our row and column is larger than what's in our current location
                // Update the values within it to contain our new row and column, and value.
                if(valueGrid[row][column] > largest.getMaxValue()){
                    largest.setRow(row); 
                    largest.setColumn(column);
                    largest.setMaxValue(valueGrid[row][column]);
                }
            }
        }

        // Return our Location object.
        return largest;
    }

    public LocationManager() {
    }
}

class LocationTest {

    public static void main(String[] args) {

        // initializes variables
        Scanner line = new Scanner(System.in);
        Scanner token = new Scanner(System.in);
        Integer column = 0;
        Integer row = 0;
        String lines = "";
        double nums = 0;

        //  Scanner reads user input to create the multi-dimensional array parameters
        System.out.println("Please enter the # of rows");
        row = token.nextInt();
        System.out.println("Please enter the # of columns");
        column = token.nextInt();

        double largestNum[][] = new double[row][column];

        //  takes in user inputs and adds each number to the correct location in the multi-dimensional array
        for (int i = 0; i < row; i++) {
            System.out.printf("%s%d%s%d%s%n", "Please enter the numbers of row", i+1, " each number seperated by a space. ", column, " numbers needed.");
            lines = line.nextLine();
            //  seperates each number inputted by a space and puts them into an array
            String digits[] = lines.split(" ");
            //  parses the String variables into ints and places them into the correct location in the multi-dimensional array
            for (int j = 0; j < column; j++) {
                nums  = Double.parseDouble(digits[j]);
                largestNum[i][j] = nums;
            }  // ends nested for loop
        }  // ends for loop

        Location biggest = LocationManager.locateLargest(largestNum);
        System.out.printf("Largest value was %.2f, at row %d and column %d\n", biggest.getMaxValue(), biggest.getRow(), biggest.getColumn());

    }  // ends main method
}  // ends LocationTest class
