//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(printHello());
        for (String arg : args) {
            System.out.println("Hello " + arg);
        }
    }

    private static String printHello() {
        return "HelloWorld";
    }
}