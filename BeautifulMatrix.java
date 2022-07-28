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
public class BeautifulMatrix {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        int move = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                x = input.nextInt();
                if(x==1){
                    move = Math.abs(i-3) + Math.abs(j-3);
                    System.out.println(move);
                    break;
                }
            }
            
        }
        
    }
    
}
