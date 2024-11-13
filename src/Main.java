import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {


        // Instantiated the firstArray assigning 10 random values
        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));
        // Sorted the firstArray in the natural order
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));
        // Instantiated the secondArray assigning 10 random values
        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        // filled the entire secondArray with the value 5
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));

        // instantiated a third array assigning 10 random values
        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        // This created a copy of thirdArray and assigned it to fourthArray
        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));
        // Sorted the copy of the array in the natural order
        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(fourthArray));
        // Created a copy of thirdArray but only assigned the first 4 values
        int[] smallerArray = Arrays.copyOf(thirdArray, 4);
        System.out.println(Arrays.toString(smallerArray));
        // Created a copy of thirdArray but assigned an additional 10 zeros after the first array
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
