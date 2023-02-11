/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rating_800;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class LastMinuteEnhancements {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt());
            }
            
            int k = arr.get(0);
            for (int i = 1; i < n; i++) {
                if(arr.get(i) <= k){
                    int x = arr.get(i);
                    arr.set(i, x+1);
                }
                k = arr.get(i);
            }
            
            HashSet<Integer> hs = new HashSet<Integer>();
            for (int i = 0; i < n; i++) {
                hs.add(arr.get(i));
            }
            
           System.out.println(hs.size());
            
        }
    }
    
}
