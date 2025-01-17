public class Location {

    private int row = 0;
    private int column = 0;
    private double maxValue = 0;

    private int getRow() {

        return this.row;

    }

    private int getColumn() {

        return this.column;

    }
    private double getMaxValue() {

        return this.maxValue;

    }

    private void setRow(int newRow) {

        this.row = newRow;
    
    }
    
    private void setcolumn(int newColumn) {

        this.column = newColumn;
    
    }
    private void setMaxValue(double newMaxValue) {

        this.maxValue = newMaxValue;
    
    }

    public Location() {

    }

}