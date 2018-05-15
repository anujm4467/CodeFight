
public class RotateMatrixBy90degree {

	public static void main(String[] args) 
	{
       int N = 4;
       int mat[][] =
       {
               {1, 2, 3, 4},
               {5, 6, 7, 8},
               {9, 10, 11, 12},
               {13, 14, 15, 16}
        };
     rotateMatrix(N, mat);
     displayMatrix(N, mat);
	}
	
	public static void rotateMatrix(int n, int mat[][])
	{
		for(int i=0; i<n; i++)
		{
			for(int j=i; j<n-i-1; j++)
			{
				int temp = mat[i][j];
				mat[i][j] = mat[j][n-1-i];
				mat[j][n-1-i] = mat[n-1-i][n-1-j];
				mat[n-1-i][n-1-j] = mat[n-1-j][i];
				mat[n-1-j][i] = temp;
			}
		}
	}
	
	    public static void displayMatrix(int N, int mat[][])
	    {
	        for (int i = 0; i < N; i++)
	        {
	            for (int j = 0; j < N; j++)
	                System.out.print(" " + mat[i][j]);
	      
	            System.out.print("\n");
	        }
	        System.out.print("\n");
	    }

}
