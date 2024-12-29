public class Binomial_coeff {
    public static int Factorials(int n){
        int fact = 1;

        for(int i=1; i<=n; i++){
            fact = fact * i;
        }
        // System.out.println("Factorial of a Number : " + fact);
        return fact;
    }
    
    public static int binoCoeff(int n, int r){
        int fact_n = Factorials(n);
        int fact_r = Factorials(r);
        int fact_nmr = Factorials(n-r);

        int binoCoeff = fact_n / (fact_r * fact_nmr);
        return binoCoeff;
    }
    public static void main(String args[]){
        System.out.println(binoCoeff(5,2));
    }
}