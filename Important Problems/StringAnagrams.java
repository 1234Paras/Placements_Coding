import java.util.Arrays;
public class StringAnagrams {
    public static void main(String args[]){
        String strs1 = "earth";
        String strs2 = "heart";
        
        //Convert Strings to lowercase. Why? so that we don't have to check separately for lower & uppercase
        strs1 = strs1.toLowerCase();
        strs2 = strs2.toLowerCase();
        
        //First check - if the lengths are the same
        if(strs1.length() == strs2.length()){
            //convert strings into char array
            char strs1charArray[] = strs1.toCharArray();
            char strs2charArray[] = strs2.toCharArray();

            //sort the char array
            Arrays.sort(strs1charArray);
            Arrays.sort(strs2charArray);

            //f the sorted char arrays are same or identical then the strings are anagram
            boolean result = Arrays.equals(strs1charArray, strs2charArray);
            if(result) {
                System.out.println(strs1 + " and " + strs2 + " are anagrams of each other ");
            }
            else {
                System.out.println(strs1 + " and " + strs2 + " are not anagrams of each other ");
            }
        }
        else {
            //case when lengths are not equal
            System.out.println(strs1 + " and " + strs2 + " are not anagrams of each other");
        }
    }
}