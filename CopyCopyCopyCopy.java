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
public class CopyCopyCopyCopy {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            HashSet<Integer> set = new HashSet<Integer>();
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
                set.add(arr[j]);
            }
            System.out.println(set.size());
        }
    }
    
}
