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
public class Bulbs {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashSet<Integer> set = new HashSet<Integer>();
        while(n-- > 0){
            int x = sc.nextInt();
            for (int i = 0; i < x; i++) {
                set.add(sc.nextInt());    
            }
        }
        
        if(set.size() == m){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    
}
