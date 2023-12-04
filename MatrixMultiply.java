import java.util.*;

class MatrixMultiply
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
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] matrix3 = new int[rows][cols];

        // Get the elements of the first matrix
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                matrix1[i][j] = sc.nextInt();
            }
        }

        // Get the elements of the second matrix
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                matrix2[i][j] = sc.nextInt();
            }
        }
        if(rows!=cols)
        {
            System.out.println("INVALID matrix for multiply");
        }
        else
        {
            for(int i=0;i<rows;i++)
            {
                for(int j=0;j<cols;j++)
                {
                    int sum=0;
                    for(int k=0;k<rows;k++)
                    {
                        sum+=(matrix1[i][k]*matrix2[k][j]);
                    }
                    matrix3[i][j]=sum;

                }
            }
            System.out.println("Multiplication=");
            for(int i=0;i<rows;i++)
            {
                for(int j=0;j<cols;j++)
                {
                    System.out.print(matrix3[i][j]+"  ");
                }
                System.out.println();
                
                
            }
        }
    }
}

                
        
                
          

