public class Staff extends Person {
    private String school;
    private double pay;

    /**
     * Constructor khong co tham so.
     */
    public Staff() {

    }

    /**
     * Phuong thuc khoi tao co nhieu tham so.
     * @param name ten
     * @param address dia chi
     * @param school truong
     * @param pay luong
     */
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    // getter and setter
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    /**
     * Phuong thuc Override toString.
     * @return string moi
     */
    @Override
    public String toString() {
        return "Staff[" + super.toString()
                + ",school=" + school + ",pay=" + pay + "]";
    }
}
