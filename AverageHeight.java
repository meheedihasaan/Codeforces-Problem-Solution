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
public class AverageHeight {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            ArrayList<Integer> even = new ArrayList<Integer>();
            ArrayList<Integer> odd = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if(x%2 == 0){
                    even.add(x);
                }
                else{
                    odd.add(x);
                }
            }
            
            if(even.size() > odd.size()){
                for (int i : even) {
                    System.out.print(i+" ");
                }
                for (int i : odd) {
                    System.out.print(i+" ");
                }
                System.out.println();
            }
            else{
                for (int i : odd) {
                    System.out.print(i+" ");
                }
                for (int i : even) {
                    System.out.print(i+" ");
                }
                System.out.println();
            }
        }
    }
    
}
