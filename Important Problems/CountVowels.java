import java.util.Scanner;
public class CountVowels {
    public static void main(String args[]){
        String strs = new Scanner(System.in).next();
        int count = 0;   
        
        for(int i=0; i<strs.length(); i++){
            char ch = strs.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        System.out.println("count of Vowels is : " + count);
    }
}