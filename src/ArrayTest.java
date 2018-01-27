import java.util.Random;

public class ArrayTest {

    public static void main(String[] args) {

        ArrayComparator comparator = new ArrayComparator();

        // create two two dimensional arrays
        int[][] array1 = new int[10][10];
        int[][] array2 = new int[10][10];

        Random randomNumber = new Random();

        // fill up first array with random numbers
        for(int i = 0; i < array1.length; i++) {
            for(int j = 0; j < array1[1].length; j++) {
                array1[i][j] = randomNumber.nextInt(10);
            }
        }

        // fill up second array with random numbers
        for(int i = 0; i < array2.length; i++) {
            for(int j = 0; j < array2[1].length; j++) {
                array2[i][j] = randomNumber.nextInt(10);
            }
        }

        // compare two different two dimensional arrays
        System.out.println("Compare two different two dimensional arrays:");
        if(comparator.compare(array1, array2)) {
            System.out.println("Arrays are same.\n");
        }else
            System.out.println("Arrays are not the same.\n");

        // assign first array into second array
        array2 = array1;

        // compare two the same two dimensional arrays
        System.out.println("Compare two same two dimensional arrays:");
        if(comparator.compare(array1, array2)) {
            System.out.println("Arrays are the same.\n");
        }else
            System.out.println("Arrays are not the same.\n");
    }
}
