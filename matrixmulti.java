 import java.util.*;
 class matrixmulti{	
 	public static void main(String args[])
 {
 System.out.println("Enter row and column of matrix A");
 Scanner sc=new Scanner(System.in);
 int m=sc.nextInt();
 int n=sc.nextInt();
 
 System.out.println("Enter row and column of matrix B");
 int p=sc.nextInt();
 int q=sc.nextInt();
 
 int A[][]=new int[5][5];
 int B[][]=new int[5][5];
 int C[][]=new int[5][5];
 
 System.out.println("Enter matrix A");
 for(int i=0;i<m;i++)
 	for(int j=0;j<n;j++){
 		A[i][j] =sc.nextInt();
 	}
 
 System.out.println("Enter matrix B");
 for(int i=0;i<p;i++)
 	for(int j=0;j<q;j++){
 		B[i][j] =sc.nextInt();
 	}
 if(n == p) {
     for(int i=0;i<m;i++){
 		for(int j=0;j<q;j++) {
                                   C[i][j] = 0;
 			for(int k=0;k<n;k++){
 				C[i][j]=A[i][k]*B[k][j]+C[i][j];	
 			}
 	                      }
                                }
                              }

else System.out.println("Matrix cannot be multiplied");


System.out.println("The matrix C = A*B is:");
for(int i=0;i<m;i++){
	for(int j=0;j<q;j++){
			System.out.print("\t"+C[i][j]);
		}
	System.out.println("");
      }
   }
}

