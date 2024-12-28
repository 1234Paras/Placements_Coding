import java.util.Scanner;
public class FuntionparameterandArguments {

    public static int calculateSum(int nums1, int nums2){ //Parameter or Formal parameters
        int sum = nums1 + nums2;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number : ");
        int a = sc.nextInt();
        System.out.println("Enter the Second number : ");
        int b = sc.nextInt();
        int sum = calculateSum(a,b); //Argument or Actual parameters
        System.out.println("Sum is : " + sum);
    }
}