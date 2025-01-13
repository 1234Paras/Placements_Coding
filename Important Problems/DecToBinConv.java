public class DecToBinConv {
    
    public static void ToBinary(int n){
        int res=0;
        int i=0;

        while(n>0){
            int rem = n % 2;
            res+=(rem*Math.pow(10,i));
            n=n/2;
            i++;
        }
        System.out.print(res);
    }
    public static void main(String args[]){
        int n=5;
        ToBinary(n);
    }
}
