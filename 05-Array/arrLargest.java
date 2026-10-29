import java.util.Scanner;
class arrLargest {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
  // System.out.println("Enter num: ");
         int arr [] = {12,21,34,32,13,45,65,23} ;
int max = arr[0]; int secondmax = Integer.MIN_VALUE ;
         for(int i = 0 ; i<arr.length ; i++){
         if(arr[i] > max){
             secondmax = max ;
             max = arr[i] ; 
             }
             else if(arr[i]<max && arr[i]>secondmax){
                 secondmax = arr[i];
             }
         }
         System.out.println(max);
         System.out.println(secondmax);
         
         sc.close();
     }
}