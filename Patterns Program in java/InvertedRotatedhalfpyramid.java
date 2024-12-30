import java.util.Scanner;
public class InvertedRotatedhalfpyramid {

    public static void Inverted_Rotated_Half_Pyramid(int n){

        for(int i=1; i<=n; i++){
            
            //Spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

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
        Inverted_Rotated_Half_Pyramid(n);
    }
}