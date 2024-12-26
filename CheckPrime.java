import java.util.Scanner;
public class CheckPrime{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number is : ");
        int n = sc.nextInt();

        int divs = 2;
        while(divs<n){
            if(n%divs==0){
                System.out.println("It is not prime number");
            }
            else{
                divs = divs + 1;
            }
        }
    }
}