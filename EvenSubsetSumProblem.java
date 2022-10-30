/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rating_800;

 import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class EvenSubsetSumProblem {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            boolean flag = true;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            for (int i = 0; i < n; i++) {
                if(arr[i]%2 == 0){
                    System.out.println(1);
                    System.out.println(i+1);
                    flag = false;
                    break;
                }     
            }
            
            if(flag){
                if(n == 1){
                    System.out.println(-1);
                }
                else{
                    System.out.println(2);
                    System.out.println(1+" "+2);
                }
            }
        }
    }
    
}
