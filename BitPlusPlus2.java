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
public class BitPlusPlus2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();
        int x = 0;
        String stmt[] = new String[n];  
        for (int i = 0; i < n; i++) {
            stmt[i] = input.next();
            if(stmt[i].equals("X++") || stmt[i].equals("++X")){
                x++;
            }
            else if(stmt[i].equals("X--") || stmt[i].equals("--X")){
                x--;
            }
        }
        System.out.println(x);
    }
    
}
