// Sum of natural number but with alternative sign
// like inpiut--> 5 // output --> 1-2+3-4+5=3
import java.util.*;
public class AlternateSum {
    public static int alternatesum(int n){
        if(n==1){
            return 1;
        }
        if(n%2==0)
        {
             return alternatesum(n-1)- n;
        }else{
            return alternatesum(n-1) + n;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the natural number");
        int n = sc.nextInt();
        System.out.println("so the natural number alternate sum is "+alternatesum(n));
    }
}
