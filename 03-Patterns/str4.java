
import java.util.Scanner;

class str4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      System.out.println("enter T : ");
      int t = sc.nextInt();
      for(int i = 0 ; i<t ; i++){
      System.out.println("enter num : ");
      int num = sc.nextInt();
      for(int j =1 ;j<=num ; j++){
            for(int k = 0 ; k<num-j+1;k++){
                System.out.print( " * " );
            }
                System.out.println();
        }  
      }
    }
}
