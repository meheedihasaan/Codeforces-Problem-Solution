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
public class HonestCoach {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int j = 0; j < n; j++) {
                list.add(sc.nextInt());
            }
            
            Collections.sort(list, Collections.reverseOrder());       //Sorting The 1st ArrayList in descending order.
            
            ArrayList<Integer> list_new = new ArrayList<Integer>();   //New ArrayList.
            for (int k = 0; k < n-1; k++) {
                list_new.add(list.get(k)-list.get(k+1));              //Add Difference between two neighboring item from list to new List.
            }
//            for (int a : list_new) {
//                System.out.println(a);
//            }
            System.out.println(Collections.min(list_new));            //Get The Minimum Difference
        }
    }
    
}
