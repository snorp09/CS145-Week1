public class Location {

    private int row = 0;
    private int column = 0;
    private double maxValue = 0;

    public int getRow() {

        return this.row;

    }

    public int getColumn() {

        return this.column;

    }
    public double getMaxValue() {

        return this.maxValue;

    }

    public void setRow(int newRow) {

        this.row = newRow;
    
    }
    
    public void setcolumn(int newColumn) {

        this.column = newColumn;
    
    }

    public void setMaxValue(double newMaxValue) {

        this.maxValue = newMaxValue;
    
    }

    public Location() {

    }

}