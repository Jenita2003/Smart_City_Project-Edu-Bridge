import java.util.*;

class SmartCityGuide {

    static Scanner scanner = new Scanner(System.in);

    // Sample Data
    static List<String> hotels = Arrays.asList("Taj Palace", "The Oberoi", "Marriott", "Hyatt Regency", "Radisson Blu");
    static List<String> transportation = Arrays.asList("Metro", "Local Buses", "Auto Rickshaws", "Car Rentals", "Bicycles");
    static List<String> shopping = Arrays.asList("City Mall", "Street Market", "Central Bazaar", "Fashion Street");
    static List<String> cityNews = Arrays.asList("Metro Line Extension", "New Shopping Mall Opening", "Tourism Festival in August", "Parks and Green Spaces");

    static String userName = "Guest";

    public static void main(String[] args) {

        while (true) {
            displayMenu();
            int choice = getUserChoice();
            
            switch (choice) {
                case 1:
                    displayHotels();
                    break;
                case 2:
                    displayTransportation();
                    break;
                case 3:
                    bookAirTicket();
                    break;
                case 4:
                    displayShopping();
                    break;
                case 5:
                    displayCityNews();
                    break;
                case 6:
                    exit();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void displayMenu() {
        System.out.println("\n--- Welcome to Smart City Guide ---");
        System.out.println("1. Hotels");
        System.out.println("2. Transportation");
        System.out.println("3. Air Ticket Booking");
        System.out.println("4. Shopping");
        System.out.println("5. City News");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }

    public static int getUserChoice() {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            scanner.next(); // consume invalid input
            System.out.println("Invalid input! Please enter a valid number.");
            return -1; // return invalid choice
        }
    }

    public static void displayHotels() {
        System.out.println("\n--- Hotels ---");
        System.out.println("1. Taj Palace (Luxury)");
        System.out.println("2. The Oberoi (5-Star)");
        System.out.println("3. Marriott (International)");
        System.out.println("4. Hyatt Regency (Premium)");
        System.out.println("5. Radisson Blu (Business)");

        System.out.print("Enter hotel number to know more, or 0 to go back: ");
        int choice = getUserChoice();
        if (choice == 0) return;

        if (choice >= 1 && choice <= 5) {
            System.out.println("You selected " + hotels.get(choice - 1) + " hotel.");
        } else {
            System.out.println("Invalid choice! Returning to main menu.");
        }
    }

    public static void displayTransportation() {
        System.out.println("\n--- Transportation Options ---");
        System.out.println("1. Metro");
        System.out.println("2. Local Buses");
        System.out.println("3. Auto Rickshaws");
        System.out.println("4. Car Rentals");
        System.out.println("5. Bicycles");

        System.out.print("Enter transportation option number to know more, or 0 to go back: ");
        int choice = getUserChoice();
        if (choice == 0) return;

        if (choice >= 1 && choice <= 5) {
            System.out.println("You selected " + transportation.get(choice - 1) + " transportation option.");
        } else {
            System.out.println("Invalid choice! Returning to main menu.");
        }
    }

    public static void bookAirTicket() {
        scanner.nextLine(); // Consume newline
        System.out.print("\nEnter your destination: ");
        String destination = scanner.nextLine();
        System.out.print("Enter your travel date (YYYY-MM-DD): ");
        String travelDate = scanner.nextLine();

        System.out.println("Booking ticket to " + destination + " on " + travelDate + "...");
        System.out.println("Ticket booked successfully!");
    }

    public static void displayShopping() {
        System.out.println("\n--- Shopping Areas ---");
        System.out.println("1. City Mall");
        System.out.println("2. Street Market");
        System.out.println("3. Central Bazaar");
        System.out.println("4. Fashion Street");

        System.out.print("Enter shopping area number to know more, or 0 to go back: ");
        int choice = getUserChoice();
        if (choice == 0) return;

        if (choice >= 1 && choice <= 4) {
            System.out.println("You selected " + shopping.get(choice - 1) + " shopping area.");
        } else {
            System.out.println("Invalid choice! Returning to main menu.");
        }
    }

    public static void displayCityNews() {
        System.out.println("\n--- Latest City News ---");
        cityNews.forEach(news -> System.out.println("- " + news));
    }

    public static void exit() {
        System.out.println("Thank you for using Smart City Guide! Exiting...");
        scanner.close();
    }
}
