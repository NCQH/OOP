public class Circle {
    private double radius;
    private String color;
    protected static final double PI = 3.14;

    /**
     * Constructor khong co tham so.
     */
    public Circle() {
    }

    /**
     * Constructor co mot tham so.
     * @param radius ban kinh
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Constructor hai tham so.
     * @param radius ban kinh
     * @param color mau
     */
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // getter and setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Phuong thuc tra ve dien tich hinh tron.
     * @return dien tich hinh tron
     */
    public double getArea() {
        return radius * radius * PI;
    }

    /**
     * Phuong thuc toString.
     * @return to string
     */
    @Override
    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + "]";
    }
}
