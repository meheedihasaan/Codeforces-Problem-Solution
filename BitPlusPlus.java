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
public class BitPlusPlus {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        int x = 0;
        String stm = null;
        n = s.nextInt();
        for (int i = 0; i < n; i++) {
            stm = s.next();
            if(stm.equals("X++") || stm.equals("++X")){
                x++;
            }
            else if(stm.equals("X--") || stm.equals("--X")){
                x--;
            }
        }
        System.out.println(x);
    }
    
}
