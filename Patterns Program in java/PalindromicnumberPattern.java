import java.util.Scanner;
public class PalindromicnumberPattern {
    
    public static void PalindromicPatt(int n){
        for(int i=1; i<=n; i++){

            //Spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //Descending
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }

            //Ascending
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();
        PalindromicPatt(n);
    }
}

/* Output :
    1
   212
  32123
 4321234
543212345
*/
