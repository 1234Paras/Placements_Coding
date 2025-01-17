public class PowerofTwoexample {

    public static boolean isPowerofTwo(int n){

        for(int i=0; i<=30; i++){

            int ans = (int) Math.pow(2,i);

            if(ans == n){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        System.out.println(isPowerofTwo(2));
    }
}
