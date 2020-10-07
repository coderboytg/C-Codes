/*
Taru Gupta
20194179
Corelation factor
*/

import java.util.*;
public class cfactor {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements in an array");
        Scanner s1=new Scanner(System.in);
        int i,j,k,n;
        n=s1.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the elements of first array");

        for(i=0;i<n;i++)
        {
            a[i]=s1.nextInt();
        }
        int[] b= new int[n];
        System.out.println("Enter the number of elements of second array");
        for(i=0;i<n;i++)
        b[i]=s1.nextInt();

        int[] c = new int[n-1];

        for(i=0;i<n-1;i++)
        {
            if(a[i]>a[i+1] && b[i]>b[i+1] || a[i]<a[i+1] && b[i]<b[i+1] || a[i]==a[i+1] && b[i]==b[i+1])
            c[i]=1;

            else
            c[i]=0;
        }
        
        int ones=0;
        int zeros=0;
        for(i=0;i<n-1;i++)
        {
            if(c[i]==0)
            zeros=zeros+1;

            if(c[i]==1)
            ones=ones+1;
        }
        //System.out.println(zeros);
        //System.out.println(ones);
        System.out.println("Corelation COefficient is "+((float)ones/(zeros+ones)));
    }
}
