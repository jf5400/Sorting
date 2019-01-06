public class BubbleSort {
    public static void swap(int[] arr, int i, int j){
        int rep = arr[i];
        arr[i] = arr[j];
        arr[j] = rep;
    }

    public static void bubbleSort(int[] arr){
        boolean swap = true;
        while(swap){
            swap = false;
            for(int i=0; i<arr.length-1; i++) {
                if(arr[i] > arr[i+1]){
                    swap(arr, i, i + 1);
                    swap = true;
                }
            }
        }
    }
}
