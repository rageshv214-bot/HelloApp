public class HelloApp {
    public static void main(String[] args) {
        // UC7: Using String.join() for automatic delimiter management
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // No loops, no substrings, no trailing commas!
            String allNames = String.join(", ", args);
            System.out.println("Hello, " + allNames + "!");
        }
    }
}
