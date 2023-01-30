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
public class GiftFixing {
    
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        
        for (int i = 0; i < t; i++) {
             int n = input.nextInt();
             ArrayList<Integer> choc = new ArrayList<Integer>();
             ArrayList<Integer> orng = new ArrayList<Integer>();
             
            for (int j = 0; j < n; j++) {
                choc.add(input.nextInt());
            }
            
            for (int k = 0; k < n; k++) {
               orng.add(input.nextInt());
            }
            
            int x = Collections.min(choc);
            int y = Collections.min(orng);
            
            long move = 0;
            for (int m = 0; m < choc.size(); m++) {
                move+= Math.max(choc.get(m) - x, orng.get(m) - y);
            }
            System.out.println(move);
        }
    }       
            
}
