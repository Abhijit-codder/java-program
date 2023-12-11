import java.util.*;

class TransposeMatrix
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Get the number of rows and columns from the user
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        // Create two matrices
        int[][] matrix = new int[rows][cols];
        int[][] tranpose = new int[rows][cols];

        // Get the elements of the first matrix
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                matrix[i][j] = sc.nextInt();
            }
        }

       

        // Transpose the matrice
        
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                tranpose[i][j] = matrix[j][i];
            }
        }

        // Print the sum matrix
        System.out.println("The transpose of the matrices is:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                System.out.print(tranpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
 
    

