import java.util.*;

public class matrix_mult {
    public static void main(String[] args) {
        
        int n,m,p,q;

        Scanner sc=new Scanner (System.in);

        System.out.print("Enter the no. of rows a:");
        n=sc.nextInt();
        System.out.print("Enter the no. of columns a:");
        m=sc.nextInt();

        System.out.print("Enter the no. of rows b:");
        p=sc.nextInt();
        System.out.print("Enter the no. of columns b");
        q=sc.nextInt();

        int a[][]= new int[n][m];
        int b[][]= new int[p][q];
        int c[][]= new int[n][q];

        System.out.print("Enter the elements of the matrix a ");
        for(int i = 0;i<n ;i++){
            for(int j = 0;j<m;j++){
                a[i][j]=sc.nextInt();
        }
    }

        System.out.print("Enter the elements of the matrix b ");
        for(int i = 0;i<p;i++){
            for(int j = 0;j<q;j++){
                b[i][j]=sc.nextInt();
            }
        }

        if(m==p) {
            
            for(int i=0;i<n;i++) {
                for(int j=0;j<q;j++) {
                    c[i][j]=0;
                    for(int k=0;k<m;k++) {
                        c[i][j]+=(a[i][k]*b[k][j]);
                    }
                    System.out.print(c[i][j]+"\t");
                }
                System.out.print("\n");

            }
        }
}
}