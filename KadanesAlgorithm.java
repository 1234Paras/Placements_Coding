public class KadanesAlgorithm {

    public static void KadanesAlgo(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i=0; i<numbers.length; i++){
            cs = cs + numbers[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Our maximum subarray sum is : " + ms);
    }
    public static void main(String args[]){
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        
        KadanesAlgo(numbers);
    }
}

//Leetcode solutions
class Solution {
    public int maxSubArray(int[] nums) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i=0; i<nums.length; i++){
            cs = cs + nums[i];

            if(cs > ms){
                ms = cs;
            }

            if(cs<0){
                cs = 0;
            }
            // ms = Math.max(cs,ms);
        }
        return ms;
    }
}
