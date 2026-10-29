
import java.util.Scanner;

class str5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      System.out.println("enter T : ");
      int t = sc.nextInt();
      for(int i = 0 ; i<t ; i++){
      System.out.println("enter num : ");
      int num = sc.nextInt();
           for(int j = 1 ;j<num ; j++){
            for(int k = 1; k<=num-j;k++){
              System.out.print(" ");
            }
            for(int k = 0; k<j*2-1;k++){
                System.out.print( "*" );
            }  
          
                System.out.println();
        }  
      }
    }
}



// opposite pattern : 
/*


class Main {
    public static void main(String[] args) {
        for(int i = 8 ;i>0 ; i--){
            for(int j = 0; j<8-i-1;j++){
              System.out.print(" ");
          }
            for(int j = 0; j<i*2-1;j++){
                System.out.print( "*" );
            }  
          
                System.out.println();
        }  
    }
}

*/



/*


// All Combined 



import java.util.Scanner;

class str5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      System.out.println("enter T : ");
      int t = sc.nextInt();
      for(int i = 0 ; i<t ; i++){
      System.out.println("enter num : ");
      int num = sc.nextInt();
           for(int j = 1 ;j<=num ; j++){
            for(int k = 1; k<=num-j;k++){
              System.out.print(" ");
            }
            for(int k = 0; k<j*2-1;k++){
                System.out.print( "*" );
            }  
          
                System.out.println();
        }  
          for(int m = num ;m>0 ; m--){
            for(int j = 0; j<=num-m-1;j++){
              System.out.print(" ");
          }
            for(int j = 0; j<m*2-1;j++){
                System.out.print( "*" );
            }  
          
                System.out.println();
        }  
      }
    }
}


*/