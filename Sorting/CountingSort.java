package Sorting;

public class CountingSort {

    public static void Countingsorting(int arrs[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arrs.length; i++){
            largest = Math.max(largest, arrs[i]);
        }

        int count[] = new int[largest+1];
        for(int i=0; i<arrs.length; i++){
            count[arrs[i]]++;
        }

        //Sorting
        int j=0;
        for(int i=0; i<count.length; i++){
            while(count[i] > 0){
                arrs[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    
    public static void printArray(int arrs[]){
        for(int i=0; i<arrs.length; i++){
            System.out.print(arrs[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arrs[] = {2,1,7,5,9};
        Countingsorting(arrs);
        printArray(arrs);
    }
}
