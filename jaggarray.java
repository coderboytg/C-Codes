/*
Taru Gupta
20194179
Jagged Array
*/

import java.util.*;
public class jaggarray {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows to be present");
        Scanner s1= new Scanner(System.in);
        int row,max=0,col;
        row=s1.nextInt();
        int jaggarr[][]= new int [row][];
        int i,j,k;

        for(i=0;i<row;i++)
        {
            System.out.println("Enter number of column in this row");
            col=s1.nextInt();

            if(col>max)
            max=col;
            jaggarr[i]= new int[col];
            System.out.println("Enter the elements in the row");

            for(j=0;j<col;j++)
            jaggarr[i][j]=s1.nextInt();
        }

        int transarr[][]= new int[max][];
        
        for(i=0;i<max;i++)
        {
            int count=0;

            for(j=0;j<row;j++)
            {
                if(jaggarr[j].length>=(i+1))
                count++;
            }

            transarr[i]= new int[count];

            for(j=0,k=0;j<count;k++)
            {
                if(jaggarr[k].length>=(i+1))
                transarr[i][j++]=jaggarr[k][i];
            }

        }
        System.out.println("Initial array");
        
        for(i=0;i<jaggarr.length;i++)
        {
            for(j=0;j<jaggarr[i].length;j++)
            System.out.print(jaggarr[i][j]+" ");
            System.out.println();
        }

        System.out.println("Transposed jagged array");

        for(i=0;i<transarr.length;i++)
        {
            for(j=0;j<transarr[i].length;j++)
            System.out.print(transarr[i][j]+" ");
            System.out.println();
        }

        int newrow,newcol;
        if(transarr.length>jaggarr.length)
        newrow=transarr.length;
        else
        newrow=jaggarr.length;
        int [][]finalarr = new int[newrow][];

        for(i=0;i<newrow;i++)
        {
            newcol=transarr[i].length + jaggarr[i].length;
            finalarr[i] = new int[newcol];

            k=0;
            for(j=0;j<jaggarr[i].length;j++)
            {
                finalarr[i][j] = jaggarr[i][k++];
            }

            for(k=0;j<newcol;j++)
	        {
	            finalarr[i][j] = transarr[i][k++];
	        }
        }

        System.out.println("The final merged array is:");

        for(i=0;i<finalarr.length;i++)
        {
            for(j=0;j<finalarr[i].length;j++)
            System.out.print(finalarr[i][j]+" ");
	        System.out.println();
        }
    }
    
}
