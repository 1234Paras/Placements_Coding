class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        // code here
        int gcd = 1;
        int lcm = 1;
        for(int i=1; i<=Math.min(a,b); i++){
            if(a%i==0 && b%i==0){
                gcd=i;
                lcm=(a*b)/gcd;
            }
        }
        int arr[] = {lcm,gcd};
        return arr;
    }
}
