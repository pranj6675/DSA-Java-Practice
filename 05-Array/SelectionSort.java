public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        for (int i = 0; i< arr.length - 1; i++) {
           int min = i ; 
           for(int j = i ; j<arr.length ; j++){
            min = j ; 
           }
           int temp = arr[min];
           arr[min] = arr[i];
           arr[i] = temp;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " , ");
        }
    }

    
}
