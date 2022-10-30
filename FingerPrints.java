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
public class FingerPrints {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            list.add(sc.nextInt());
        }
        
        for (int i = 0; i < n; i++) {
            if(list.contains(arr.get(i))){
                System.out.print(arr.get(i)+" ");
            }
        }
        System.out.println();
    }
    
}
