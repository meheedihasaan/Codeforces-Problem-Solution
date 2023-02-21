package Rating_800;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class MaximumIncrease {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int a = 1;
        int b = 1;
        for (int i = 0; i < n-1; i++) {
            if(arr[i] < arr[i+1]){
                a++;
                if(a > b){
                    b = a;
                }
            }
            else{  
                a = 1;
            }
        }
        
        System.out.println(b);
        
       
    }
    
}
