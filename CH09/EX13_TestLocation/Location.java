           // UML Class Diagram                     
/***************************************************
*                   Location                       *  
* -------------------------------------------------*  
* -row: int                                        *
* -column: int                                     *
* -maxValue: double                                *
* -------------------------------------------------* 
* +Location(a: double[][])                         *
***************************************************/
public class Location {
    
    public int row;
    public int column;
    public double maxValue;
    
    // constructor that passes a matrix through and finds max element, row, and column for element
    Location(double[][] a) {
        this.maxValue = a[0][0];
        this.row = 0;
        this.column = 0;
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (maxValue < a[i][j]) {
                    this.maxValue = a[i][j];
                    this.row = i;
                    this.column = j;
                }
            }
        }

    }
}
