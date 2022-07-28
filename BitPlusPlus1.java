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
public class BitPlusPlus1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int x = 0;
        String stmt = null;
        n = input.nextInt();
        for (int i = 0; i < n; i++) {
            stmt = input.next();
            if(stmt.charAt(1) == '+'){
                x++;
            }
            else if(stmt.charAt(1) == '-'){
                x--;
            }
        }
        System.out.println(x);
    }
    
}
