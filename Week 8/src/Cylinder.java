public class Cylinder extends Circle {
    private double height;

    /**
     * Constructor khong co tham so.
     */
    public Cylinder() {
    }

    /**
     * Constructor lop con co mot tham so.
     * @param height chieu cao
     */
    public Cylinder(double height) {
        super();
        this.height = height;
    }

    /**
     * Constructor lop con co hai tham so.
     * @param radius ban kinh
     * @param height chieu cao
     */
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    /**
     * Constructor lop con co 3 tham so.
     * @param radius ban kinh
     * @param height chieu cao
     * @param color mau
     */
    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    // getter and setter
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Phuong thuc tinh the tich.
     * @return the tich
     */
    public double getVolume() {
        return getArea() * height;
    }

    /**
     * Override phuong thuc toString.
     * @return string moi
     */
    @Override
    public String toString() {
        return "Cylinder[" + super.toString() + ",height=" + height + "]";
    }

    /**
     * Override phuong thuc get Area tinh dien tich hai mat day.
     * @return dien tich hai mat day
     */
    @Override
    public double getArea() {
        return super.getArea() * 2;
    }
}
