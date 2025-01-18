public class CheckEvenOrOddBitManipulation {

    public static void oddoreven(int n){
        int bitmask=1;
        if((n & bitmask) == 0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }

    public static int getithsBit(int n, int i){
        int bitmask = 1<<i;
        if((n & bitmask) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }

    public static int setithsBit(int n, int i){
        int BitMask = 1<<i;
        return n | BitMask;
    }

    public static int clearithsBit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static int updateithsBit(int n, int i, int newBit){

        //First Approach
        /*if(newBit == 0){
            return clearithsBit(n,i);
        }
        else{
            return setithsBit(n,i);
        }*/

        //Second Approach Time Optimization
        n = clearithsBit(n, i);
        int BitMask = newBit<<i;
        return n | BitMask;
    }

    public static int clearIlastBits(int n, int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }

    public static int clearIrangeBits(int n, int i, int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }
    public static void main(String args[]){
        oddoreven(1);
        oddoreven(2);
        System.out.println(getithsBit(10,1));
        System.out.println(setithsBit(10,2));
        System.out.println(clearithsBit(10,1));
        System.out.println(updateithsBit(10, 2, 1));
        System.out.println(clearIlastBits(15,2));
        System.out.println(clearIrangeBits(10,2,4));
    }
}