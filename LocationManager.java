// Name: Christopher Waschke, Jackson Jenks, Brody Weinkauf
// Assignment: Week 1 - OOP
// Purpose: Find location in double 2d array of largest value.

public class LocationManager {
    public static Location locateLargest(double[][] a){
        // Rows
        Location largest = new Location();
        
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                if(a[i][j] > largest.getMaxValue()){
                    largest.setRow(i); 
                    largest.setColumn(j);
                    largest.setMaxValue(a[i][j]);
                }
            }
        }

        return largest;
    }
}
