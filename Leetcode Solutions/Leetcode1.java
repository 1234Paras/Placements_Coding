public class Leetcode1 {
    public static int subtractProductAndSum(int n) {
            
            int sums=0;
            int product=1;
    
            while(n!=0){
                int digit = n % 10;
                product = product * digit;
                sums = sums + digit;
    
                n = n / 10;
            }
            int answer = product - sums;
            return answer;
        }
        
        public static void main(String args[]){
            int n = 234;
            System.out.println(subtractProductAndSum(n));
    }
}