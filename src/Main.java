import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = {1, 5, 7, 9, 11, 15};
       System.out.println("Sayınızı giriniz:");
        int target = input.nextInt();

        // Diziyi sıralamak için arrays.sort() kullanıyoruz
        Arrays.sort(numbers);


        int closestSmallest = 0;
        int closestLargest = 0;
        int difference = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int currentDifference = Math.abs(target - numbers[i]);
            if (currentDifference < difference) {
                closestSmallest = numbers[i];
                difference = currentDifference;
            }
        }
        closestLargest = closestSmallest == numbers[numbers.length - 1] ? closestSmallest : numbers[numbers.length - 1];
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] > target) {
                closestLargest = numbers[i];
                break;
            }
        }


        System.out.println("En yakın küçük sayı: " + closestSmallest);
        System.out.println("En yakın büyük sayı: " + closestLargest);
    }
}
