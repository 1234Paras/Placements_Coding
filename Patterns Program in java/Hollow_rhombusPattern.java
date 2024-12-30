import java.util.Scanner;
public class Hollow_rhombusPattern {
    
    public static void Hollow_Rhombus(int n){

        for(int i=1; i<=n; i++){

            //Spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            //Hollow Rectangle
            for(int j=1; j<=n; j++){
                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();
        Hollow_Rhombus(n);
    }
}