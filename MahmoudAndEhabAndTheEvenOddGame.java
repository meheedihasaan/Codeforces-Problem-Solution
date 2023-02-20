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
public class MahmoudAndEhabAndTheEvenOddGame {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int turn = 0;
        for (int i = 1; i <= n; i++) {
            n = n/i;
            turn = i;
        }
        
        if(turn%2 == 0){
            System.out.println("Mahmoud");
        }
        else{
            System.out.println("Ehab");
        }
    
    }
    
}
