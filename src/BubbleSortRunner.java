public class BubbleSortRunner
{
    public static void main(String[] args)
    {
        int[] testArr = new int[]{2,3,5,9,1,2,3,5};

        System.out.println("Before: ");
        for(int num:testArr){
            System.out.println(num+" ");
        }
        System.out.println();

        BubbleSort.bubbleSort(testArr);

        System.out.println("After:");
        for(int num:testArr){
            System.out.println(num+" ");
        }
        System.out.println();
    }
}
