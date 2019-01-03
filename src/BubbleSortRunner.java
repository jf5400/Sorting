public class BubbleSortRunner {
    public static void main(String[] args){
        int[] testArr = [2,3,5,9,1,2,3,5];

        System.out.println("Before: ");
        for(int num:testArr){
            System.out.println(num+" ");
        }
        System.out.println();

        utils.bubbleSort(testArr);

        System.out.println("After:");
        for(int num:testArr){
            System.out.println(num+" ");
        }
        System.out.println();
    }
}
