/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rating_800;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class PointsInSegments {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashSet<Integer> hs = new HashSet<Integer>();
        while(n-- > 0){
            int l = sc.nextInt();
            int r = sc.nextInt();
            for (int i = l; i <= r; i++) {
                hs.add(i);
            }
        }
        
        System.out.println(m-hs.size());
        for (int i = 1; i <= m; i++) {
            if(!hs.contains(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    
}
