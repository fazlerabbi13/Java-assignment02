import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean hasOrder = false;
        String currentOrder = "";
        
        System.out.println("Welcome to Our Restaurant!");
        
        do {
            // Display menu options
            System.out.println("\nPlease select an option:");
            System.out.println("1. View Menu");
            System.out.println("2. Place Order");
            System.out.println("3. Check Order Status");
            System.out.println("4. Cancel Order");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            
            // Get user input
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            // Process user choice
            switch (choice) {
                case 1:
                    viewMenu();
                    break;
                case 2:
                    currentOrder = placeOrder(scanner);
                    hasOrder = true;
                    break;
                case 3:
                    checkOrderStatus(hasOrder, currentOrder);
                    break;
                case 4:
                    hasOrder = cancelOrder(hasOrder);
                    currentOrder = "";
                    break;
                case 5:
                    System.out.println("Thank you for visiting our restaurant. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        } while (choice != 5);
        
        scanner.close();
    }
    
    private static void viewMenu() {
        System.out.println("\n=== Our Menu ===");
        System.out.println("1. Burger - $8.99");
        System.out.println("2. Pizza - $12.99");
        System.out.println("3. Pasta - $10.99");
        System.out.println("4. Salad - $6.99");
        System.out.println("5. Drink - $2.50");
    }
    
    private static String placeOrder(Scanner scanner) {
        System.out.println("\n=== Place Your Order ===");
        viewMenu();
        System.out.print("Enter the item number you'd like to order: ");
        int item = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        String order;
        switch (item) {
            case 1:
                order = "Burger";
                break;
            case 2:
                order = "Pizza";
                break;
            case 3:
                order = "Pasta";
                break;
            case 4:
                order = "Salad";
                break;
            case 5:
                order = "Drink";
                break;
            default:
                order = "Unknown Item";
        }
        
        System.out.println("You have ordered: " + order);
        return order;
    }
    
    private static void checkOrderStatus(boolean hasOrder, String currentOrder) {
        if (hasOrder) {
            System.out.println("\nYour current order: " + currentOrder);
            System.out.println("Status: Being prepared");
        } else {
            System.out.println("\nYou don't have any active orders.");
        }
    }
    
    private static boolean cancelOrder(boolean hasOrder) {
        if (hasOrder) {
            System.out.println("\nYour order has been canceled.");
            return false;
        } else {
            System.out.println("\nNo active order to cancel.");
            return false;
        }
    }
}
