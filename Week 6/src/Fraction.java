public class Fraction {
    private int numerator;
    private int denominator;

    /**
     * Constructor co tham so.
     * @param numerator tu so
     * @param denominator mau so
     */
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator != 0) {
            this.denominator = denominator;
        } else {
            this.denominator = 1;
        }
    }

    /**
     * Phuong thuc rut gon.
     * @return Phan so duoc toi gian
     */
    public Fraction reduce() {
        if (this.numerator != 0) {
            int a = gcd(numerator, denominator);
            numerator /= a;
            denominator /= a;
        }
        return this;
    }

    /**
     * Phuong thuc cong phan so.
     * @param frac phan so thu hai
     * @return ket qua
     */
    public Fraction add(Fraction frac) {
        if (this.denominator != frac.denominator) {
            this.numerator = this.numerator * frac.denominator + frac.numerator * this.denominator;
            this.denominator = this.numerator * frac.denominator;
        } else {
            this.numerator = this.numerator + frac.numerator;
        }
        return this;
    }

    /**
     * Phuong thuc tru phan so.
     * @param frac phan so bi tru
     * @return ket qua
     */
    public Fraction subtract(Fraction frac) {
        if (this.denominator != frac.denominator) {
            this.numerator = this.numerator * frac.denominator - frac.numerator * this.denominator;
            this.denominator = this.denominator * frac.denominator;
        } else {
            this.numerator = this.numerator - frac.numerator;
        }
        return this;
    }

    /**
     * Phuong thuc nhan phan so.
     * @param frac phan so thu hai
     * @return ket qua
     */
    public Fraction multiply(Fraction frac) {
        this.numerator = this.numerator * frac.numerator;
        this.denominator = this.denominator * frac.denominator;
        return this;
    }

    /**
     * Phuong thuc chia phan so.
     * @param frac phan so bi chia
     * @return ket qua
     */
    public Fraction divide(Fraction frac) {
        if (frac.numerator != 0) {
            this.numerator = this.numerator * frac.denominator;
            this.denominator = this.denominator * frac.numerator;
        }
        return this;
    }

    /**
     * Phuong thuc so sanh hai phan so.
     * @param obj phan so duoc so sanh
     * @return true hoac false
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Fraction) {
            Fraction frac = (Fraction) obj;
            frac.reduce();
            Fraction old = this;
            old.reduce();
            return old.numerator == frac.numerator && old.denominator == frac.denominator;
        }
        return false;
    }

    /**
     * Phuong thuc tim uoc chung lon nhat.
     * @param a so thu nhat
     * @param b so thu hai
     * @return ket qua
     */
    private static int gcd(int a, int b) {
        if (b == 0) {
            return Math.abs(a);
        }
        return gcd(b, a % b);
    }

    // getter & setter
    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    /**
     * Day la setter ma.
     * @param denominator mau so
     */
    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        }
    }

    public static void main(String[] args) {
        Fraction a = new Fraction(1, 5);
        Fraction b = new Fraction(2, 5);
        Fraction c = new Fraction(1, 7);

        System.out.println(a.equals(c));

        a.view();
        a.subtract(c);
        a.view();

    }

    public void view() {
        System.out.println("Num: " +  numerator);
        System.out.println("Denom: " +  denominator);
    }
}
