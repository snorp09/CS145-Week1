// Author: Christopher Waschke
// Assignment: Locate Largest in Array With Objects
// Description: When given a 2d array, create a location object that contains the row, column, and value, of the largest entry.
// Citation: http://sekrit.de/webdocs/c/beginners-guide-away-from-scanf.html
// Citation: https://cplusplus.com/reference/cstring/strtok/


// Our Includes
#include "stdio.h"
#include "stdlib.h"
#include "string.h"

// Create the structure that will hold the information about our location.
struct location{
    int row;
    int column;
    double maxValue;
} typedef Location; // Type def as Location, since typing struct before hand is sort of annoying, plus looks closer to our java version.

// Initialize a blank Location struct.
Location newLocation(){
    Location loc;
    loc.row = 0; 
    loc.column = 0;
    loc.maxValue = 0;
    return loc;
}


// Location Method
// Returns Location struct with the row, column, and maxValue from our double array.
// We're using the GCC extensions to allow for this, so it's not portable.
// Args:
//  rows (int) how many rows we have.
//  cols (int) how many columns we have.
//  valueGrid (2d double array) our 2d array of values to find the largest in.
Location locateLargest(int rows, int cols, double valueGrid[rows][cols]){
    Location largest = newLocation();

    // Loop through each row and column checking if the value at the index
    // is larger than what we currently have in our location.
    for(int row = 0; row < rows; row++){
        for(int col = 0; col < cols; col++){
            if(valueGrid[row][col] > largest.maxValue) {
                largest.row = row;
                largest.column = col;
                largest.maxValue = valueGrid[row][col];
            }
        }
    }

    return largest;
}

// double* method,
// Returns a pointer to a memory block containing doubles parsed from the user's input.
// Args:
//  parseStr (char*/c-string) String that we're going to be looking for numbers in.
//  numbCount (int) How many double's were searching for.
double* getNumbsFromString(char* parseStr, int numbCount){
    // Create a memory block to hold the specified number of doubles.
    // Frankly, I'm playing lose with my naming here, since it's not quite an array, but a pointer
    // That we're doing arithmetic on. Though I suppose that's really what an array is at the end of the day.
    double* numbArr = malloc(sizeof(double)*numbCount); 


    // Split our parsed string, then loop through each split.
    int index = 0;
    char* token;
    token = strtok(parseStr, " "); // Get the token of the first split.
    while (token != NULL)
    {
        // Break from our while loop if we're done collecting numbers.
        if(index > numbCount) {
            break;
        }

        numbArr[index] = atof(token); // At our pointer, at index (pointer arithmetic shortcut, not an array) store double parsed from string.
        token = strtok(NULL, " "); // Change our token to our next split.
        index++; // Increase our index.
    }
    
    return numbArr;
}

// Main Method, entry point.
// Our parameters are boiler plate C, for taking in cmd arguments. Not used.
// Prompts the user for the size of the array, and then asks them to populate the values.
// Once done populating, find the largest within that array.
int main(int argc, char** argv){
    // Initialize our data, and buffer.
    int rows = 0;
    int columns = 0;
    char inBuff[128];

    // Get user input for size of rows and columns.
    printf("How many rows and columns> ");
    fgets(inBuff, 128, stdin);
    double* sizes = getNumbsFromString(inBuff, 2);
    rows = sizes[0];
    columns = sizes[1];
    free(sizes); // Look at me. Not having a memory leak.

    double numbArr[rows][columns]; // Create a 2d array using our parsed rows and columns.

    // For each row in the array, get values for each column.
    for(int rowIndex = 0; rowIndex < rows; rowIndex++){
        printf("Please enter your column values> ");
        fgets(inBuff, 128, stdin);

        // Read the values from the console, and then assign them to the column.
        double* colValues = getNumbsFromString(inBuff, columns);
        for(int colIndex = 0; colIndex < columns; colIndex++){
            numbArr[rowIndex][colIndex] = colValues[colIndex];
        }
        free(colValues); // Free pointer containing our read values.
    }

    // Locate the largest value in the 2d array.
    Location loc = locateLargest(rows, columns, numbArr);

    // Inform the user of the largest value, and it's coordinates.
    printf("The largest value was %.1f, at row %d, and column %d\n", loc.maxValue, loc.row, loc.column);
}