public class SecondsrowelementSum {
    public static void main(String args[]){
        int nums[][] = {{1,4,9},{11,4,3},{2,2,3}};
        int sums = 0;

        //Sums of 2nd rows elements
        for(int j=0; j<nums[0].length; j++){
            sums += nums[1][j];
        }
        System.out.println("Sums is : " + sums);
    }
}