import java.util.*;

public class quicksort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.print("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        QuickSort(a, 0, n - 1);

        System.out.println("Sorted Array:");
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    private static void QuickSort(int[] a, int lowindex, int highindex) {
        if (lowindex >= highindex)
            return;

        int pivot = a[highindex];
        int leftPointer = lowindex;
        int rightPointer = highindex;

        while (leftPointer < rightPointer) {
            while (a[leftPointer] <= pivot && leftPointer < rightPointer)
                leftPointer++;
            while (a[rightPointer] >= pivot && leftPointer < rightPointer)
                rightPointer--;

            swap(a, leftPointer, rightPointer);
        }

        swap(a, leftPointer, highindex);

        QuickSort(a, lowindex, leftPointer - 1);
        QuickSort(a, leftPointer + 1, highindex);
    }

    private static void swap(int[] a, int index1, int index2) {
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }
}
