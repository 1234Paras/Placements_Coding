import java.util.Scanner;
public class InvertedHalfpyramidnumber {

    public static void Inverted_Number_Half_Pyramid(int n){

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();
        
        Inverted_Number_Half_Pyramid(n);
    }
}

/* Output :
12345
1234
123
12
1
*/
