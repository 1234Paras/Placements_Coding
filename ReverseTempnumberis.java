public class ReverseTempnumberis {
    public static void main(String args[]){
        int no = 1234567;
        int revs = 0;

        while(no > 0){
            int lastDigit = no % 10;
            revs = (revs * 10) + lastDigit;
            no = no / 10;
        }
        System.out.println(revs);
    }
}