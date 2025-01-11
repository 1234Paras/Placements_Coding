public class StringBuilderUpperCase {

    public static String toUpperCase(String strs){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(strs.charAt(0));
        sb.append(ch);
        
        for(int i=1; i<strs.length(); i++){
            if(strs.charAt(i) == ' ' && i<strs.length()-1){
                sb.append(strs.charAt(i));
                i++;
                sb.append(Character.toUpperCase(strs.charAt(i)));
            }
            else{
                sb.append(strs.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String args[]){
        String strs = "hi, this is a tonys";
        System.out.println(toUpperCase(strs));
    }
}

//Time Complexity - O(n)