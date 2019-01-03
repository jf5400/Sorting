public class utils {
    public static void swap(int[] arr, int i, int j){
        int rep = arr[j];
        arr[i] = arr[j];
        arr[j] = rep;
    }

    public static void bubbleSort(int[] arr){
        boolean swap = false;
        while(swap){
            for(int i=0; i<arr.length; i++){
                swap(arr, i, i+1);
            }
            if(){

            }
        }
    }

    public static int[] randIntArr(int count){
        int[] arr= new int[count];
        for(int i=0; i<arr.length;i++){
            arr[i]=(int)(Math.random()*10001);
        }
        return arr;
    }
}
