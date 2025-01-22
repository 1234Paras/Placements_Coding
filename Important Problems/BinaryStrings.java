public class BinaryStrings {

    public static void printBinStrings(int n, int lastPlace, String strs){

        // if(lastPlace == 0){
        //     printBinStrings(n-1, 0, strs.append("0"));
        //     printBinStrings(n-1, 1, strs.append("1"));
        // } else {
        //    printBinStrings(n-1, 0, strs.append("0"));
        //}

        if(n == 0){
            System.out.println(strs);
            return;
        }

        printBinStrings(n-1, 0, strs+"0");
        if(lastPlace == 0){
            printBinStrings(n-1, 1, strs+"1");
        }
    }
    public static void main(String args[]){
        printBinStrings(4, 0, "");
    }
}