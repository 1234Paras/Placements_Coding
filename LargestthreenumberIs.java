public class LargestthreenumberIs {
    public static void main(String args[]){

        int a = 1, b = 4, c = 9;

        if((a>=b) && (a>=c)){
            System.out.println("A is the greatest number");
        }
        else if((b>=a) && (b>=c)){
            System.out.println("B is the greatest number");
        }
        else{
            System.out.println("C is the greatest number");
        }

        //Ternary Operator
        int number = 5;

        String type = ((number%2)==0) ? "even" : "odds";
        System.out.println(type);
    }
}
