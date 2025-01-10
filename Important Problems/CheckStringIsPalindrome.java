public class CheckStringIsPalindrome{

    public static boolean isPalindrome(String strs){
        for(int i=0; i<strs.length()/2; i++){
            int n = strs.length();
            if(strs.charAt(i) != strs.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String strs = "racecar";
        System.out.println(isPalindrome(strs));
    }
}

//Time Complexity - O(n)