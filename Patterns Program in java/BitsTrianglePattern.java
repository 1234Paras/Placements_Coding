import java.util.Scanner;
public class BitsTrianglePattern {

    public static void zero_one_Triangle(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j) % 2 == 0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        zero_one_Triangle(n);
    }
}

/* Output :
1
01
101
0101
10101
*/
