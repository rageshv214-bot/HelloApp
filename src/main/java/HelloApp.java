public class HelloApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // StringBuilder is efficient for joining many strings
            StringBuilder names = new StringBuilder();
            
            for (int i = 0; i < args.length; i++) {
                names.append(args[i]);
                // Add a comma and space only if it's NOT the last name
                if (i < args.length - 1) {
                    names.append(", ");
                }
            }
            
            System.out.println("Hello, " + names.toString() + "!");
        }
    }
}