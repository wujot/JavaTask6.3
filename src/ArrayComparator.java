import java.lang.reflect.Array;

public class ArrayComparator {

    public boolean compare(int[][] array1, int[][] array2) {

        int number1;
        int number2;

        if (array1.length == array2.length && array1[0].length == array2[0].length) {
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array1[0].length; j++) {
                    number1 = array1[i][j];
                    number2 = array2[i][j];
                    if(number1 == number2) {
                        return true;
                    } else
                        return false;
                }
            }
            return true;
        } else
            return false;
    }
}
