import java.util.Arrays;

public class Statistics {
    public static void main(String[] args) {
        int dataArray[] = {2, 5, 5, 9, 4, 7, 0, 9, 6, 11, 12};

        // Calculate and print the mean
        double mean = getMean(dataArray);
        System.out.println("Mean: " + mean);

        // Calculate and print the median
        double median = getMedian(dataArray);
        System.out.println("Median: " + median);

        // Calculate and print the standard deviation
        double standardDeviation = getSD(dataArray, mean);
        System.out.println("Standard Deviation: " + standardDeviation);
    }

    // Method to calculate mean
    public static double getMean(int[] array) {
        double sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Method to calculate median
    public static double getMedian(int[] array) {
        Arrays.sort(array); // Sort the array
        int length = array.length;
        if (length % 2 == 0) {
            // Even length: average of the two middle elements
            return (array[length / 2 - 1] + array[length / 2]) / 2.0;
        } else {
            // Odd length: middle element
            return array[length / 2];
        }
    }

    // Method to calculate standard deviation
    public static double getSD(int[] array, double mean) {
        double sumSquaredDifferences = 0;
        for (int num : array) {
            sumSquaredDifferences += Math.pow(num - mean, 2);
        }
        return Math.sqrt(sumSquaredDifferences / array.length);
    }
}
