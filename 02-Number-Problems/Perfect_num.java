// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.Scanner;
class Perfect_num{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num : ");
        int num = sc.nextInt();
        int sum = 0 ; 
        for(int i = 1 ; i < num ; i++){
            if(num%i==0){
                sum+=i ;
            }
            
        }
        if(sum == num ){
            System.out.println("Yes its perfect Number ");
        }
        else{
            System.out.println("No ,  its not  perfect Number ");
        }
            
}
}