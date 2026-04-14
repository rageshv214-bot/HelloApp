public class HelloApp {
    public static void main(String[] args) {
        // If args has something, use args[0]. If not, use "World".
        String name = (args.length > 0) ? args[0] : "World";
        System.out.println("Hello, " + name + "!");
    }
}
