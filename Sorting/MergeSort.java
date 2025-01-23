public class MergeSort {

    public static void printArr(int arrs[]){
        for(int i=0; i<arrs.length; i++){
            System.out.print(arrs[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arrs[], int si, int ei){

        if(si >= ei){
            return;
        }

        int mids = si + (ei - si)/2;
        mergeSort(arrs, si, mids); //left part
        mergeSort(arrs, mids+1, ei); // right part
        merge(arrs, si, mids, ei);
    }

    public static void merge(int arrs[], int si, int mids, int ei){
        int temp[] = new int[ei-si+1];
        int i = si; //iterator for left part
        int j = mids+1; //iterator for right part
        int k = 0; // iterator for temp arrs

        while(i <= mids && j <= ei){
            if(arrs[i] < arrs[j]){
                temp[k] = arrs[i];
                i++;
            } else {
                temp[k] = arrs[j];
                j++;
            }
            k++;
        }

        //left part
        while(i <= mids){
            temp[k++] = arrs[i++];
        }

        //right part
        while(j <= ei){
            temp[k++] = arrs[j++];
        }

        //copy temp to original arrs
        for(k=0, i=si; k<temp.length; k++, i++){
            arrs[i] = temp[k];
        }
    }
    public static void main(String args[]){
        int arrs[] = {6,1,9,5,2,8};
        mergeSort(arrs, 0, arrs.length-1);
        printArr(arrs);
    }
}

//Time Complexity
//O(nlogn)

//Space Complexity
//O(n)