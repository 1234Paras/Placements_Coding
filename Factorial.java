import java.util.Scanner;
public class Factorial {

    public static int Factorials(int n){
        int fact = 1;

        for(int i=1; i<=n; i++){
            fact = fact * i;
        }
        // System.out.println("Factorial of a Number : " + fact);
        return fact;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();
        
        int facts = Factorials(n);
        System.out.println("Factorial of a number is : " + facts);
    }
}