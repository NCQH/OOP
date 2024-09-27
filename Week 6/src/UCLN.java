public class UCLN {
    /**
     * Phuong thuc tim uoc so chung lon nhat cua 2 so nguyen a va b.
     * @param a so nguyen a
     * @param b so nguyen b
     * @return ket qua
     */
    public static int gcd(int a, int b) {
        if (b == 0) {
            return Math.abs(a);
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.print(gcd(Integer.MAX_VALUE, -30));
    }
}
