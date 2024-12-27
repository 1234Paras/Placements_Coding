import java.util.*;
public class CheckPrime{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter number : ");
      int n = sc.nextInt();

      if(n == 2){
        System.out.println("n is a prime number");
      }
      else{
      boolean isPrime = true;
      for(int i=2; i<=Math.sqrt(n);/* (n-1) */ i++){
        if(n % i == 0){ // n is a multiple of i (i not equal to 1 or n)
            isPrime = false;
        }
      }
      if(isPrime == true){
        System.out.println("N is a prime number");
      }
      else{
        System.out.println("N is not a prime number");
      }
      }
    }
}