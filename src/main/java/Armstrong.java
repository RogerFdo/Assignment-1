import java.util.*;
public class Armstrong{
    public static int isarmstrong(int n){
        int arm=0,r,c;
        c=n;
        while(n>0){
            r=n%10;
            arm=(r*r*r)+arm;
            n=n/10;
        }
        if(c==arm)
            System.out.println("The given number is a armstrong number");
        else
            System.out.println("The given number is not an armstrong number");
        return arm;
    }
}