
  //row - rowCount = spaceCount 


public class pattern_problem_01 {
    public static void main(String[] args) {
        // Number of rows for the triangle
        int row = 4;

        // Outer loop for each row
        for (int rowCount = 1; rowCount <= row; rowCount++) {
            // Inner loop for printing leading spaces
            for (int sp_count = 1; sp_count <= row - rowCount; sp_count++) {
                System.out.print(" "); // one spaces for better alignment
            }
            // Inner loop for printing numbers
            for (int col_count = 1; col_count <= rowCount; col_count++) {
                System.out.print(col_count);
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}

/*
   1 
  12 
 123 
1234 
*/