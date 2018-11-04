package factorial;

public class Factorial {

    public static long iterationFactor(int n){
        long result = 1;
        if (n < 0)
            return 0;
        if (n == 0)
            return 1;
        if (n == 1 || n == 2)
            return n;
        while(n!=1){
            result *=n;
            n--;
        }
        return result;
    }

    public static long recursFactor(int n){
        if(n>1) {
            return n * recursFactor(n - 1);
        }
        return 1;
    }

    private static long partTree(int l,int r){
        if (l > r)
            return 1;
        if (l == r)
            return l;
        if (r - l == 1)
            return l * r;
        int m = (l + r) / 2;
        return partTree(l, m) * partTree(m + 1, r);
    }

    public static long treeFactor(int n){
        if (n < 0)
            return 0;
        if (n == 0)
            return 1;
        if (n == 1 || n == 2)
            return n;
        return partTree(2, n);
    }

    public static void compareAllMethods(int n){
        long result;
        long startTime = System.nanoTime();
        result = iterationFactor(n);
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("Result = " + result + "  Iteration method:" + estimatedTime);
        startTime = System.nanoTime();
        result = recursFactor(n);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Result = " + result + "  Recurse method:" + estimatedTime);
        startTime = System.nanoTime();
        result = treeFactor(n);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Result = " + result + "  Tree method:" + estimatedTime);
    }

}
