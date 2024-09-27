public class Fibonacci {

    /**
     * Phuong thuc tinh so fibonacci thu n.
     *
     * @param n so thu tu
     * @return so fibonaci thu n
     */
    public static long fibonacci(long n) {
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            long fib1 = 0;
            long fib2 = 1;
            long fibn = 0;
            for (int i = 2; i <= n; i++) {
                fibn = fib1 + fib2;
                fib1 = fib2;
                fib2 = fibn;
                if (fib2 < fib1) {
                    return Long.MAX_VALUE;
                }
            }
            return fibn;
        }
    }

    public static void main(String[] args) {
        int n = 104;
        long m = fibonacci(n);
        System.out.println(m);
    }
}
