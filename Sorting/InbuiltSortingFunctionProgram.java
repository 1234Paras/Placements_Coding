package Sorting;
import java.util.Arrays;
import java.util.Collections;

public class InbuiltSortingFunctionProgram {

    public static void printArrays(Integer arrs[]){
        for(int i=0; i<arrs.length; i++){
            System.out.print(arrs[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Integer arrs[] = {2,1,7,4,9}; // If collection used than we can use Integer full keywords
        // int arrs[] = {2,1,7,4,9};
        //Direct Sorting
        // Arrays.sort(arrs);
        //Indexed Based Sorting Technique
        // Arrays.sort(arrs,0,2);

        //Collections Framework use reverse order array
        // Arrays.sort(arrs, Collections.reverseOrder());

        Arrays.sort(arrs, 0, 2, Collections.reverseOrder());
        printArrays(arrs);
    }
}