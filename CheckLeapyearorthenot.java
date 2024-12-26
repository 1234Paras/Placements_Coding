import java.util.Scanner;
public class CheckLeapyearorthenot {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year : ");
        int years = sc.nextInt();

        boolean x = (years%4) == 0;
        boolean y = (years%100) != 0;
        boolean z = ((years % 100 == 0) && (years % 400) == 0);

        if(x && (y || z)){
            System.out.println(years + " is a leap year");
        }
        else{
            System.out.println(years + " is not a leap year");
        }
    }
}