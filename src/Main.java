import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {


        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
         Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));
        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(fourthArray));

        int[] smallerArray = Arrays.copyOf(thirdArray, 4);
        System.out.println(Arrays.toString(smallerArray));

        int[] largerArray = Arrays.copyOf(thirdArray, 20);
        System.out.println(Arrays.toString(largerArray));

    }


    public static int[] getRandomArray(int len) {

        Random random = new Random();
        int[] newInt = new int[len];
        // this for loop assigns a random value to an array element
        for(int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100); // This random argument is called the exclusive upper bound. Excludes 100.
        }
        return newInt;

    }
}
