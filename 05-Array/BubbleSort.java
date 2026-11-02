
class BubbleSort {

    public static void main(String[] args) {
        int arr[] = {6, 5, 3, 2, 4, 1, 7};
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;

                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " , ");
        }
    }
}
/*  j har baar kam karenge Kyuki har 
pass me last elements sorted hote jate hai . */
