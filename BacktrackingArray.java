public class BacktrackingArray {

    public static void changeArr(int arr[], int i, int vals){

        //Base Case
        if(i == arr.length){
            printArr(arr);
            return;
        }
        //recursion
        arr[i] = vals;
        changeArr(arr, i+1, vals+1);
        arr[i] = arr[i] - 2;
    }
    
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);
    }
}