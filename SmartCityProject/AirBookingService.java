import java.util.Scanner;

public class AirBookingService {

    @SuppressWarnings("resource") // Suppresses the warning about Scanner not being closed
    public void bookTicket() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter your destination: ");
        String dest = sc.nextLine();
        System.out.print("Enter date of journey: ");
        String date = sc.nextLine();

        System.out.println("Booking ticket to " + dest + " on " + date + "...");
        System.out.println("Ticket Booked Successfully!");
    }
}
