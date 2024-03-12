public class Sorting {
    public static void bubble_sort(int arr[]) {

        // Bubble sort
        for (int i=0; i<arr.length-1; i++) {
            boolean flag = true;
            for (int j=0; j<arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = false;
                }
            }
            if (flag == true) {
                break;
            }
        }
    }
    public static void selection_sort(int arr[]) {

                // Selection sort
        for (int i=0; i<arr.length-1; i++) {  // no of passes
            int min = arr[i];
            int idx = i;
            for (int j=i; j<arr.length; j++) {
                if (arr[j]<min) {
                    min = arr[j];
                    idx = j;
                }
            }
            arr[idx] = arr[i];
            arr[i] = min;
        }
    }
    public static void insertion_sort(int arr[]) {

        //insertion sort
        for (int i=1; i<arr.length; i++) {
            int curr = arr[i];
           int j = i-1;
            while (j>=0 && arr[j] > curr) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;
        }
    }
    public static void counting_sort (int arr[] ) {

        // counting sort
        int max = Integer.MIN_VALUE;
        //to find range of arr
        for (int i=0; i< arr.length; i++) {
            max = Math.max(max,arr[i]);
        }

        // fto find frequency of element in a range
        int freq [] = new int[max+1]; // because range come from max function not include 0
        for (int i=0; i<arr.length; i++) {
            freq[arr[i]]++;
        }

        // now sorting
        int j=0;
        for (int i=0; i< freq.length; i++) {
            while (freq[i]>0) {
                arr[j] = i;
                j++;
                freq[i]--;
            }
        }
    }











    public static void main(String[] args) {
        int arr[] = {9,1,4,5,676,8,87,5};
        System.out.print("Unsorted Array :");
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        bubble_sort(arr);
        System.out.print("\nBubble sort : ");
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        selection_sort(arr);
        System.out.print("\nSelection sort : ");
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        insertion_sort(arr);
        System.out.print("\nInsertion sort : ");
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        counting_sort(arr);
        System.out.print("\nCounting sort : ");
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
