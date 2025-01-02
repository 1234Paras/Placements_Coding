public class LinearSearch {

    public static int Linear_Srchs(int nums[], int keys){
        for(int i=0; i<nums.length; i++){
            if(nums[i] == keys){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int nums[] = {2,4,6,8,10,12};
        int keys = 10;

        int index = Linear_Srchs(nums, keys);
        if(index == -1){
            System.out.println("Element is not Present");
        }
        else{
            System.out.println("Element present at index is : " + index);
        }
    }
}