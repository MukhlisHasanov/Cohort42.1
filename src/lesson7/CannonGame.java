import java.util.Scanner;

public class CannonGame {
    // Method to calculate the projectile distance
    public static double calculateDistance(double angle, double velocity) {
        // Constant for acceleration due to gravity (in m/s^2)
        double g = 9.8;

        // Convert angle from degrees to radians
        double angleRad = Math.toRadians(angle);

        // Calculate projectile distance using the formula
        double distance = (Math.pow(velocity, 2) * Math.sin(2 * angleRad)) / g;

        return distance;
    }

    public static void main(String[] args) {
        // Generating a random target distance
        double targetDistance = 100; // Example: target is at a distance of 100 meters

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Cannon Game!");
        System.out.println("The target is located at a distance of " + targetDistance + " meters.");

        // Getting input from the player
        System.out.print("Enter the angle in degrees: ");
        double angle = scanner.nextDouble();
        System.out.print("Enter the initial velocity of the projectile in m/s: ");
        double velocity = scanner.nextDouble();

        // Calculating the projectile distance
        double projectileDistance = calculateDistance(angle, velocity);

        // Checking the result and informing the player
        if (projectileDistance < targetDistance) {
            System.out.println("Under shot. The projectile fell " + (targetDistance - projectileDistance) + " meters short of the target.");
        } else if (projectileDistance > targetDistance) {
            System.out.println("Over shot. The projectile passed the target by " + (projectileDistance - targetDistance) + " meters.");
        } else {
            System.out.println("Direct hit! The target is hit!");
        }

        scanner.close();
    }
}
