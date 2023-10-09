import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a list of numbers separated by spaces: ");
        String userInput = scanner.nextLine();

        double average = AverageCalculator.calculateAverage(userInput);
        System.out.println("Average: " + average);
    }
}
