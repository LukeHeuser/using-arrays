import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

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

        String[] sArray = {"Mike", "Luke", "Doug", "Preston", "Chevy"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));

        if (Arrays.binarySearch(sArray, "Mike") >= 0) {
            System.out.println("Found Mike in the list");
        }

        int[] intArray = {1, 5, 9, 7, 8, 6, 5};
        Arrays.sort(intArray);
        if(Arrays.binarySearch(intArray, 4) >= 0) {
            System.out.println("Found the number 4!");
        } else {
            System.out.println("Did not find the number 4. .");
        }

        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {1, 2, 3, 4, 5, 0};
        if(Arrays.equals(s1, s2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }

        int[] nextIntArray = {1,2,3,4,5};
        System.out.println(nextIntArray.length);

        Scanner scanner = new Scanner(System.in);



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
