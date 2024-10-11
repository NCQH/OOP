public class Person {
    private String name;
    private String address;

    /**
     * Phuong thuc khoi tao khong co tham so.
     */
    public Person() {

    }

    /**
     * Constructor co hai tham so.
     * @param name ten
     * @param address dia chi
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Phuong thuc Override toString.
     * @return string moi
     */
    @Override
    public String toString() {
        return "Person[name=" + name + ",address=" + address + "]";
    }
}
