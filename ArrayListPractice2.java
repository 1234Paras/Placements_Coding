import java.util.ArrayList;
import java.util.Collections;
public class ArrayListPractice2 {

    public static void swap(ArrayList<Integer> list, int indx1, int indx2){
        int temp = list.get(indx1);
        list.set(indx1, list.get(indx2));
        list.set(indx2, temp);
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);

        int indx1 = 0, indx2 = 2;
        System.out.println(list);
        swap(list, indx1, indx2);
        System.out.println(list); 

        Collections.sort(list);
        System.out.println(list);

        //Descending Order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}