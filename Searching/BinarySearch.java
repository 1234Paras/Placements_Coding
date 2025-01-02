public class BinarySearch {

    public static int BinarySrchs(int numbers[], int keys){
        int start = 0;
        int ends = numbers.length - 1;;

        while(start<=ends){
            int mid = start + (ends - start) / 2;

            if(numbers[mid] == keys){
                return mid;
            }
            else if(numbers[mid] > keys){
                ends = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[] = {1,2,3,4,5,6,7};
        int keys = 5;

        System.out.println("Elements present at index is : " + BinarySrchs(numbers, keys));
    }
}