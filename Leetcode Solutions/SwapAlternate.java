public class SwapAlternate {

    public static void printArray(int arr[], int n){

        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void swapAlternate(int arr[], int size){
        for(int i=0; i<size; i+=2){
            if(i+1 < size){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
    }
    public static void main(String args[]){
        int even[] = {5,2,9,4,7,6,1,0};
        int odd[] = {11,34,9,76,42};

        swapAlternate(even, 8);
        printArray(even, 8);
    }
}