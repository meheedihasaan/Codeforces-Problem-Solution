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
public class Equality {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next().toLowerCase();
        int freq[] = new int[27];
        for (int i = 0; i < n; i++) {
            freq[s.charAt(i)-'a']++;
        }
        
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < k; i++) {
            min = Math.min(min, freq[i]);
        }
        System.out.println((long)min*k);
    }
    
}
