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
public class FavoriteSequence {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int j = 0; j < n; j++) {
                list.add(sc.nextInt());
            }
            
            int l = n;
            for (int k = 0; k < (n+1)/2; k++) {
                l--;
                System.out.print(list.get(k)+" ");
                if(l >= (n+1)/2){
                    System.out.print(list.get(l)+" ");
                }
            }
            System.out.println();
        }
    }
    
}
