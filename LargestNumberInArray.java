public class LargestNumberInArray {

    public static int LargestNo(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest Value : " + smallest);
        return largest;
    }
    public static void main(String args[]){
        int numbers[] = {1,2,6,7,5};
        System.out.println("Largest Value : " + LargestNo(numbers));
    }
}
