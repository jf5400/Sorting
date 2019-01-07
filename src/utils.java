public class utils {
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
    public static int[] randIntArr(int count){
        int[] arr= new int[count];
        for(int i=0; i<arr.length;i++){
            arr[i]=(int)(Math.random()*10001);
        }
        return arr;
    }

    public static boolean isSorted(int[] arr){
        boolean inorder =true;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<arr[i+1]){
               inorder = false;
            }
        }
        return inorder;
    }
    public static boolean CheckSum(int[] before, int[] after){
        if(before.length!=after.length){
            return false;
        }

        int beforesum=0;
        int aftersum=0;
        for(int i=0;i<before.length; i++){
            beforesum+=before[i];
            aftersum+=after[i];
        }
        if(beforesum==aftersum){
            return true;
        }
        else{
            return false;
        }
    }
}
