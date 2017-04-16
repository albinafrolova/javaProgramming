/**
 *
 * @author albinafrolova
 */
import java.util.Scanner;

public class Array {

    public static float getMean(int[] num) {
        int tot = 0;
        for (int i = 0; i < num.length; i++) {
            tot += num[i];
        }
        return ((float) tot / num.length);
    }

    public static float getStdDev(int[] num) {
        float mean = getMean(num);

        float totDevMean = 0.0f;
        for (int i = 0; i < num.length; i++) {

            float dev = num[i] - mean;
            dev = dev * dev;
            totDevMean += dev;
        }
        return (float) Math.sqrt(totDevMean / num.length);
    }

    public static void main(String[] args) {
        float num;
        int[] numbers = new int[19];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter list of numbers: (Type stop to stop entering numbers)");

        int i = 0;
        while (scan.hasNextInt()) {
            if (i == 19) {
                break;
            } else {
                numbers[i] = scan.nextInt();
            }
            i++;
        }

        float mean = getMean(numbers);
        System.out.println(mean);
        float dev = getStdDev(numbers);
        System.out.println(dev);
    }
}
