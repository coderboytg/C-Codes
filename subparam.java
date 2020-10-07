/*
Taru Gupta
20194179
Substance Parameters
*/

import java.util.*;
public class subparam {
    public String substance;
    public float fp;
    public float bp;

    subparam(String s,float fpt,float bpt)
    {
        this.substance=s;
        this.fp=fpt;
        this.bp=bpt;
    }

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        String subs;
        float fpt,bpt;
        int i,j,k,n;
        System.out.println("Enter the number of substances you want to add in the table: ");
        n=s1.nextInt();
        subparam[] data;
        data = new subparam[n];
        System.out.println("Enter the name, boiling point and freezing point of the substances");

        for(i=0;i<n;i++)
        {
            s1.nextLine();
            subs = s1.nextLine();
            bpt = s1.nextFloat();
            fpt = s1.nextFloat();
            data[i] = new subparam(subs,fpt,bpt);
        }

        s1.nextLine();

        System.out.println("Enter the name of substance:");
        subs= s1.nextLine();

        System.out.println("Enter the freezing point:");
        fpt= s1.nextFloat();

        System.out.println("Enter the boiling point:");
        bpt = s1.nextFloat(); 
       

        for(i=0;i<n;i++)
        {
            if(data[i].substance.equals(subs))
            {
                if(data[i].fp==fpt)
                System.out.println("The entered freezing point of the given substance is correct.");
                else
                System.out.println("The entered freezing point of the given substance is incorrect.");

                if(data[i].bp==bpt)
                System.out.println("The entered boiling point of the given substance is correct.");
                else
                System.out.println("The entered boiling point of the given substance is incorrect.");

                break;
            }
        }

        if(i==n)
        System.out.println("Substance not found.");
    }
}
