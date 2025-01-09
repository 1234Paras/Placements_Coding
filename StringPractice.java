import java.util.*;
public class StringPractice {

    public static void printLetters(String characters){
        for(int i=0; i<characters.length(); i++){
            System.out.print(characters.charAt(i));
        }
        System.out.println();
    }
    public static void main(String args[]){
        //Strings are the Immutable

        char ch[] = {'a', 'b', 'c', 'd'};

        String st = "abcd";
        String strs = new String("Hello World");
        
        System.out.println(st);
        System.out.println(strs);
        
        //Input Output
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println(name);

        //To Calculate the String Length
        String names = "Tonys Stark";

        System.out.println(names.length());

        //Concatenation
        String firstname = "Tonys";
        String lastname = "Stark";
        String fullname = firstname + " " + lastname;
        System.out.println(fullname);

        //charAt Function
        System.out.println(fullname.charAt(0));
        printLetters(fullname);
    }
}