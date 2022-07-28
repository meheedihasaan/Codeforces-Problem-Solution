package Rating_800;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Arena {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            Arrays.sort(arr);
            
            int count = 0;
            for (int i = 1; i < arr.length; i++) {
                if(arr[i] > arr[0]){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
    
}
