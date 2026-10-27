import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double distance = scanner.nextDouble();
        double time = scanner.nextDouble();

        double velocity = (distance / time) * 3.6;

        System.out.println(velocity + " km/h");

        if (velocity < 60) {
            System.out.println("Too slow. Needs more changes.");
        } else if (velocity <= 90) {
            System.out.println("Velocity is okay. The car is ready!");
        } else {
            System.out.println("Too fast. Only a few changes should suffice.");
        }

        scanner.close();
    }
}