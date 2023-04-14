package class8;

public class Exp {
    public static int exp(int a, int n) {
        if(n == 0) {
            return 1;
        }
        int pow = exp(a, n / 2);
        return a * pow * pow;
    }
    static int powerOfTwo(int N) {
        if(N == 0) {
            return 1;
        }
        return 2 * powerOfTwo(N - 1);
    }    

    static int slowerPowerOfTwo(int N) {
        if(N == 0) {
            return 1;
        }
        return slowerPowerOfTwo(N - 1) + slowerPowerOfTwo(N - 1);
    }  
}
