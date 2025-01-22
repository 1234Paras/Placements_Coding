public class PowerFunction {

    public static int power(int x, int n){ // O(n)

        if(n==0){
            return 1;
        }

        return x * power(x, n-1);
    }

    public static int optimizedPower(int a, int n){ //O(logn)
        if(n==0){
            return 1;
        }

        int halfPower = optimizedPower(a, n/2);
        int halfPowerSq = halfPower * halfPower;

        if(n % 2 != 0){
            halfPowerSq = a * halfPowerSq;
        }

        return halfPowerSq;
    }
    public static void main(String args[]){
        System.out.println(power(2,10));
        
        System.out.println(optimizedPower(2,10));
    }
}