package collectionframework;

import java.util.Arrays;

public class ArraysClassDemo {
    public static void main(String[] args) {
        int[] arr = {10 , 20 , 30 , 40 , 50};
        int[] arr2 = new int[5];
        int[][] arr3 = {{1 , 2 , 3} , {4 , 5 , 6} , {7 , 8 , 9}};
        int pos = Arrays.binarySearch(arr , 30);
        System.out.println("Position: " + pos);
        Arrays.fill(arr , -1);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(arr3));
        System.out.println(Arrays.mismatch(arr , arr2));
        System.out.println(Arrays.compare(arr , arr2));


    }
}
