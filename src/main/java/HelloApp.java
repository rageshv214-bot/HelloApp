public class HelloApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder nameBuilder = new StringBuilder();
            
            // Enhanced For-Loop: Always add name + comma + space
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }
            
            // Clean up: Remove the very last ", " (last 2 characters)
            String finalNames = nameBuilder.substring(0, nameBuilder.length() - 2);
            
            System.out.println("Hello, " + finalNames + "!");
        }
    }
}