import java.util.HashSet;

public class DuplicateElements {

    // O(n)^2 - Time Complexity
    public static boolean ContainsDuplicate(int nums[]){
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    // O(n) - Time Taken
    /*public static boolean ContainsDuplicate(int nums[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }
            else{
                set.add(nums[i]);
            }
        }
        return false;
    } */
    public static void main(String args[]){
        int nums[] = {1,2,4,1};
        System.out.println(ContainsDuplicate(nums));
    }
}