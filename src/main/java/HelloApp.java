public class HelloApp {
    public static void main(String[] args) {
        // UC2: Check if an argument (name) was provided
        if (args.length > 0) {
            // Access the first argument using index 0
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } else {
            // Default fallback if no name is given
            System.out.println("Hello, World!");
        }
    }
}