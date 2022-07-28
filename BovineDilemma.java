/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rating_800;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class BovineDilemma {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            ArrayList<Integer> base = new ArrayList<Integer>();
            int x = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i+1; j < n; j++){ 
                    x = arr[i] - arr[j];
                    if(!base.contains(x)){
                        base.add(x);
                    }
                    x = 0;
                }
            }
            System.out.println(base.size());
        }       
    }
    
}
