class Solution {
    public static int sumOfDivisors(int n) {
        // code here
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum += (int)(n/i) * i;
        }
        return sum;
    }
}
