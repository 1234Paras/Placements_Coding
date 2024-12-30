import java.util.Scanner;
public class ButterflyPattern {

    public static void Butterfly(int n){

        //1st Halfs
        for(int i=1; i<=n; i++){
            //stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //space - 2*(n-i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            
            //stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd Halfs
        for(int i=n; i>=1; i--){
            //stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //space - 2*(n-i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            
            //stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();
        
        Butterfly(n);
    }
}

/* Output :
*        *
**      **
***    ***
****  ****
**********
**********
****  ****
***    ***
**      **
*        *
*/
