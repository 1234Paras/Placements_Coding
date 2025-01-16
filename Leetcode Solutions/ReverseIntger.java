public class ReverseIntger {
    
    public static int reverseNumber(int n){
        
        int ans = 0;

        while(n != 0){
            int Digits = n % 10;

            if((ans>Integer.MAX_VALUE/10) || (ans<Integer.MIN_VALUE/10)){
                return 0;
            }

            ans = (ans * 10) + Digits;
            n =  n / 10;
        }
        return ans;
    }
    public static void main(String args[]){
        System.out.println(reverseNumber(12345));
    }
}