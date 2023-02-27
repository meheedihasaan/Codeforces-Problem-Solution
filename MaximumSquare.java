/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rating_800;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class MaximumSquare {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt());
            }
            
            Collections.sort(arr, Collections.reverseOrder());
            
            ArrayList<Integer> sq = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                int x = arr.get(i);
                if(x > sq.size()){
                    sq.add(x);
                }
            }
            System.out.println(sq.size());
        }
    }
    
}
