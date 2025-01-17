import java.util.Scanner;

// MovieTicket Class: Represents a movie ticket with attributes movie name, seat number, and price.
class MovieTicket
{
    private String movieName;
    private String seatNumber;
    private double price;

    // Constructor to initialize movie ticket attributes
    public MovieTicket(String movieName, String seatNumber, double price)
    {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    // Method to book a ticket (assign seat and update price)
    public void bookTicket(String seatNumber, double price)
    {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket Book for seat " + seatNumber + " at price "+ price);
    }

    // Method to display ticket details
    public void displayTicketDetails()
    {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Ticket Price: $" + price);
    }

    // Main method to demonstrate the MovieTicket class
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter movie name: ");
        String movieName = scanner.nextLine();

        // Create a MovieTicket object
        MovieTicket ticket = new MovieTicket(movieName, "", 0);

        System.out.print("Enter seat number: ");
        String seatNumber = scanner.nextLine();

        System.out.print("Enter ticket price: ");
        double price = scanner.nextDouble();

        // Book the ticket with seat and price
        ticket.bookTicket(seatNumber, price);

        // Display ticket details
        ticket.displayTicketDetails();

        // Close the scanner object
        scanner.close();
    }
}

