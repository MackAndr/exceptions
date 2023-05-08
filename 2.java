package HomeWork1;

import java.util.Arrays;

public class Exercise2 {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        Exercise2 exercise2 = new Exercise2();
        int[] array1 = new int[] {6, 5, 7, 8};
        int[] array2 = new int[] {2, 3, 4, 5};
        int[] array3 = exercise2.getDifArray(array1, array2);
        System.out.println(Arrays.toString(array3));
    }
    public int[] getDifArray(int[] array1, int[] array2) throws ArrayIndexOutOfBoundsException {
        if (array1.length != array2.length) {
            throw new ArrayIndexOutOfBoundsException("Массивы не одинаковой длины");
        }
        int[] difArr = new int[array1.length];
        int i, j, k;
        i = j = k = 0;
        while (i < array1.length) {
            difArr[k] = array1[i] - array2[j];
            i++;
            j++;
            k++;
        }
        return difArr;
    }
}
