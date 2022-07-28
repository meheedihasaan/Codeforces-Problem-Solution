package Rating_800;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class AntiKnapsack {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<Integer>();
            for (int i = k+1; i <= n; i++) {
                arr.add(i);
            }

            for (int i = (k+1)/2; i <= k-1; i++) {
                arr.add(i);
            }
            
            if(arr.isEmpty()){
                System.out.println(0);
            }
            else{
                System.out.println(arr.size());
                for (int i : arr) {
                    System.out.print(i+" ");
                }
                System.out.println();
            }
        }
    }
    
}
