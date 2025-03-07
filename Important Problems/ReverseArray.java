public class ReverseArray {

    public static void reverse(int arr[], int n){
        int start = 0;
        int end = n-1;

        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
    
    public static void printArray(int arr[], int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int arr[] = {1,4,0,5,-2,15};
        int brr[] = {2,6,5,9,4};

        reverse(arr, 6);
        reverse(brr, 5);
        
        printArray(arr, 6);
        printArray(brr, 5);
    }
}

//C++ Code
// void reverse(int arr[], int n){

//     int start = 0;
//     int end = n-1;
    
//     while(start<=end){
//         swap(arr[start], arr[end]);
//         start++;
//         end--;
//     }
// }

// void printArray(int arr[], int n){

//     for(int i=0; i<n; i++){
//         cout<<arr[i]<<" ";
//     }
//     cout<<endl;
// }

// int main(){

//     int arr[6] = {1,4,0,5,-2,15};
//     int brr[5] = {2,6,5,9,4};

//     reverse(arr, 6);
//     reverse(brr, 5);

//     printArray(arr, 6);
//     printArray(brr, 5);
// }
