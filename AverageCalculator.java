import java.util.ArrayList;
import java.util.Scanner;

public class AverageCalculator {
    public static double calculateAverage(String input) {
        String[] tokens = input.split(" ");
        ArrayList<Double> numbers = new ArrayList<>();

        for (String token : tokens) {
            try {
                double num = Double.parseDouble(token);
                numbers.add(num);
            } catch (NumberFormatException e) {
                System.err.println("Invalid input: " + token);
            }
        }

        if (numbers.isEmpty()) {
            System.out.println("No valid numbers entered.");
            return 0.0;
        }

        double total = 0;
        for (double num : numbers) {
            total += num;
        }

        return total / numbers.size();
    }
}
