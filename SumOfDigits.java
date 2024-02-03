import java.util.*;
public class SumOfDigits {
    public static int sum(int n){
        int result=0;
        if(n==0){
            return 0;
        }else{
            result = n%10 + sum(n/10);
            return result;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int result = sum(n);
        System.out.println("the sum is "+result);

    }
}
