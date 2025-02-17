import java.util.ArrayList;
public class ArrayListPractice {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        //Add Elements
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);

        System.out.println(list);

        //Get Elements
        int element = list.get(1);
        System.out.println(element);

        //Delete Elements
        list.remove(1);
        System.out.println(list);

        //Set Elements
        list.set(1,10);
        System.out.println(list);

        //Contains Elements
        System.out.println(list.contains(1));

        //Size Function
        System.out.println(list.size());

        //Print All Elements Lists
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println();

        //Reverse of an Arraylist
        for(int i=list.size()-1; i>=0; i--){
            System.out.println(list.get(i));
        }
        System.out.println();
        
        //O(n) - Linear Time
        //Maximum Element Print ArrayList
        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            /* if(max < list.get(i)){
                max = list.get(i);
            } */
           max = Math.max(max, list.get(i));
        }
        System.out.println("Maximum Element : " + max);
    }
}