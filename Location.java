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
    public void setcolumn(int newColumn) {

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