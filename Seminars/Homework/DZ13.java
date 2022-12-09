package Seminars.Homework;

/*
 * Реализовать алгоритм пирамидальной сортировки (HeapSort). 
 */

 public class DZ13 {
    public static void main(String[] args) {
        int arr[] = {1, 15, 44, 7, 66, 18, 4, 25};
        int n = arr.length;

        DZ13 ob = new DZ13();
        ob.sort(arr);

        System.out.println("Отсортированный массив: ");
        printArray(arr);
    }

    public void sort(int arr[]) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) 
            heapify(arr, n, i);
        for (int i = n - 1; i >= 0; i--) { 
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    void heapify(int arr[], int n, int i) {     
        int largest = i;                        
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) 
            largest = left;
        if (right < n && arr[right] > arr[largest]) 
            largest = right;
        if (largest != i) {                         
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
    }
}