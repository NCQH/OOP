public class Prime {

    /**
     * Phuong thuc kiem tra 1 so co phai so nguyen to khong.
     * @param n so can kiem tra
     * @return true hoac false
     */
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        } else if (n == 2) {
            return true;
        } else {
            boolean flag = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    flag = false;
                    break;
                }
            }
            return flag;
        }
    }

    public static void main(String[] args) {
        System.out.print(isPrime(25));
    }
}
