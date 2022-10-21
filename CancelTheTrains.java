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
public class CancelTheTrains {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            ArrayList<Integer> arr1 = new ArrayList<Integer>();
            ArrayList<Integer> arr2 = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                arr1.add(sc.nextInt());
            }
            int count = 0;
            for (int i = 0; i < m; i++) {
                arr2.add(sc.nextInt());
                if(arr1.contains(arr2.get(i))){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
    
}
