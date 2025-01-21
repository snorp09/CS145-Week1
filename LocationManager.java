// Name: Christopher Waschke, Jackson Jenks, Brody Weinkauf
// Assignment: Week 1 - OOP
// Purpose: Find location in double 2d array of largest value.
// Citation: Class Lectures 1/13/2025, 1/14/2025, 1/15/2025

// Location Manager Class
// Wraps our methods for interacting with our Location data class.
public class LocationManager {
    
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
