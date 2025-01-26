//Time Complexity Worst Case is - O(n^2)
//Time Complexity Best Case is - O(n)
public class ModifiedBubbleSortingExample {

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void modifiedBubbleSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            boolean swapped = false;
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    //Swaps
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false){
                break;
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {4,2,7,5,9};
        modifiedBubbleSort(arr);
        printArray(arr);
    }
}