/*
Taru Gupta
20194179
Corelation matrix
*/

import java.util.*;

public class cmatrix {

    static float cf(int a[],int b[])
    {
        int i,n=5,ones=0,zeroes=0;
        for(i=1;i<n;i++)
        {
            if((a[i]>a[i-1] && b[i]>b[i-1]) || (a[i]<a[i-1] && b[i]<b[i-1]) || (a[i]==a[i-1] && b[i]==b[i-1]))
            ones++;

            else
            zeroes++;
        }        
        float cfactor = ((float)ones/(n-1));

        return cfactor;
    }
    
    public static void main(String[] args)
    {
        Scanner s1 = new Scanner(System.in);

        int a[][] = new int[5][5];

        System.out.println("Enter the elements of the 5x5 matrix: ");

        int i,j;
        for(i=0;i<5;i++)
        {
            for(j=0;j<5;j++)
            a[i][j] = s1.nextInt();
        }

        //Calculating co-relational factor for every pair of rows...!!

        float cmatrix[][] = new float[5][5];

        for(i=0;i<5;i++)
        {
            for(j=0;j<=i;j++)
            {
               float send = cf(a[i],a[j]);
               cmatrix[i][j] = send;
               cmatrix[j][i] = send;
            }
        }
        System.out.println("The Corelational Matrix is: ");
        for(i=0;i<5;i++)
        {
            for(j=0;j<5;j++)
            System.out.print(cmatrix[i][j] + "  ");

            System.out.println();
        }
    }
}
