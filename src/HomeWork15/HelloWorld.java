package HomeWork15;

public class HelloWorld {
    private static HelloWorld instance;

    public static synchronized HelloWorld getInstance() {
        if (instance == null) {
            instance = new HelloWorld();
        }
        return instance;
    }
    void printHelloWorld () {
        System.out.println("Hello World!");
    }
}
