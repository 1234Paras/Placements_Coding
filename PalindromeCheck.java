import java.util.Scanner;
public class PalindromeCheck {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int palindrome = sc.nextInt();
        
        if(isPalindrome(palindrome)){
            System.out.println("Number : " + palindrome + " is a Palindrome Number");
        }
        else{
            System.out.println("Number : " + palindrome + " is not a Palindrome Number");
        }
    }
    public static boolean isPalindrome(int number){
        int palindrome = number;
        int reverse = 0;
    
        while(palindrome != 0){
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
    
        if(number == reverse){
            return true;
        }
        return false;
    }
}