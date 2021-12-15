package autoboxing;

public class Autoboxing {

    public static void autoboxing(Integer inteiro) {
        System.out.println("Integer");
    }

    public static void autoboxing(Object inteiro) {
        System.out.println("Object");
    }

    public static void main(String[] args) {
        Autoboxing.autoboxing(1L);
    }
}
