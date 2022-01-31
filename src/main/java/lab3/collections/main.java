package lab3.collections;
import java.util.Arrays;



public class main {

	public static void main(String[] args) {
        int[] x = { 9,8,7,6,5,4,3,2,1 };
        int[] y = { 5,3,2,6,1,4,7,9,8 };
        int[] z = { 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10 };
        System.out.println("No sorted array x = " + Arrays.toString(x));

        QuickSort.quickSort(x, 0, x.length - 1);
        System.out.println("Sorted by quickSort = " + Arrays.toString(x));
        
        System.out.println("No sorted array y = " + Arrays.toString(y));
        
        BubbleSort.bubbleSort(y);
        System.out.println("Sorted by bubbleSort = " + Arrays.toString(y));
        
        System.out.println("No sorted array z = " + Arrays.toString(z));
        
        BubbleSort.bubbleSort(z);
        System.out.println("Sorted by insertionSort = " + Arrays.toString(z));
        
        
    }

}
