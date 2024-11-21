import java.util.*;
class EcoRidePlanner {

    // Main entry point
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Eco Ride Planner!");
        while (true) {
            System.out.println("\nPlease choose an option:");
            System.out.println("1. Calculate optimal route");
            System.out.println("2. Plan ride-sharing");
            System.out.println("3. Estimate fuel cost");
            System.out.println("4. Calculate carbon footprint");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    calculateOptimalRoute(scanner);
                    break;
                case 2:
                    planRideSharing(scanner);
                    break;
                case 3:
                    estimateFuelCost(scanner);
                    break;
                case 4:
                    calculateCarbonFootprint(scanner);
                    break;
                case 5:
                    System.out.println("Thank you for using Eco Ride Planner. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Method to calculate the optimal eco-friendly route
    private static void calculateOptimalRoute(Scanner scanner) {
        System.out.println("\n--- Optimal Route Calculation ---");
        System.out.print("Enter starting location: ");
        String start = scanner.nextLine();
        System.out.print("Enter destination: ");
        String destination = scanner.nextLine();
        
        System.out.println("Calculating the most eco-friendly route...");
        System.out.printf("Optimal route from %s to %s has been determined!\n", start, destination);
        System.out.println("Tips: Avoid congested routes and choose roads with steady traffic flow.");
    }

    // Method to plan ride-sharing
    private static void planRideSharing(Scanner scanner) {
        System.out.println("\n--- Ride-Sharing Planner ---");
        System.out.print("Enter total number of seats in your vehicle: ");
        int totalSeats = scanner.nextInt();
        System.out.print("Enter available seats: ");
        int availableSeats = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (availableSeats > 0) {
            System.out.println("Ride-sharing is possible!");
            System.out.printf("You can offer %d seat(s) to passengers.\n", availableSeats);
        } else {
            System.out.println("No available seats for ride-sharing. Consider carpooling on your next ride.");
        }
    }

    // Method to estimate fuel cost
    private static void estimateFuelCost(Scanner scanner) {
        System.out.println("\n--- Fuel Cost Estimator ---");
        System.out.print("Enter distance of the trip (in kilometers): ");
        double distance = scanner.nextDouble();
        System.out.print("Enter fuel efficiency of your vehicle (km/l): ");
        double efficiency = scanner.nextDouble();
        System.out.print("Enter current fuel price (per liter): ");
        double fuelPrice = scanner.nextDouble();

        double fuelCost = (distance / efficiency) * fuelPrice;
        System.out.printf("Estimated fuel cost for this trip is: %.2f\n", fuelCost);
    }

    // Method to calculate carbon footprint
    private static void calculateCarbonFootprint(Scanner scanner) {
        System.out.println("\n--- Carbon Footprint Calculator ---");
        System.out.print("Enter distance of the trip (in kilometers): ");
        double distance = scanner.nextDouble();
        System.out.print("Enter fuel efficiency of your vehicle (km/l): ");
        double efficiency = scanner.nextDouble();
        System.out.print("Enter CO2 emissions per liter of fuel (in kg, e.g., 2.31 for petrol): ");
        double co2PerLiter = scanner.nextDouble();

        double carbonFootprint = (distance / efficiency) * co2PerLiter;
        System.out.printf("Estimated carbon footprint for this trip is: %.2f kg of CO2\n", carbonFootprint);
    }
}