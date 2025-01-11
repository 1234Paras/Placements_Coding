public class StringCompression {
    
    public static String compress(String strs){
        String newstrs = "";
        
        for(int i=0; i<strs.length(); i++){
            Integer count = 1;
            while(i<strs.length()-1 && strs.charAt(i) == strs.charAt(i+1)){
                count++;
                i++;
            }
            newstrs += strs.charAt(i);
            if(count > 1){
                newstrs += count.toString();
            }
        }
        return newstrs;
    }
    public static void main(String args[]){
        String strs = "aaaabbccccdd";
        System.out.println(compress(strs));
    }
}

//Time Complexity - O(n)