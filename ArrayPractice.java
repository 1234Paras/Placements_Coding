import java.util.Scanner;
public class ArrayPractice {
    public static void main(String args[]){
        int marks[] = new int[5];
        
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter Numbers : ");

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        marks[3] = sc.nextInt();

        System.out.println("Physics : " + marks[0]);
        System.out.println("Chemistry : " + marks[1]);
        System.out.println("Maths : " + marks[2]);
        System.out.println("English : " + marks[3]);

        int percentage = (marks[0] + marks[1] + marks[2] + marks[3]) / 3;
        System.out.println("Percentage : " + percentage);

        System.out.println("Length of the Array : " + marks.length);
    }
}