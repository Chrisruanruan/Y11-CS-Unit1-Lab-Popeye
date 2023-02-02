import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance to travel in nautical miles: ");
        double distance = scanner.nextDouble();
        System.out.print("Enter the top speed of the boat in knots: ");
        double topSpeed = scanner.nextDouble();
        System.out.print("Enter the average speed of the boat in knots:");
        double averageSpeed = scanner.nextDouble();
        double regularDistance = distance * 1.1508;
        double bestCaseTravelTime = distance / topSpeed;
        double averageCaseTravelTime = distance / averageSpeed;
        String info = "The distance to travel in regular miles is:" + regularDistance + "\nThe best case travel time is:" + bestCaseTravelTime + "\nThe average case travel time is:"
+ averageCaseTravelTime;
        System.out.println(info);
    }

}