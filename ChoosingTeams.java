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
public class ChoosingTeams {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int mem = 0;
        for (int i = 0; i < n; i++) {
            int y = input.nextInt();
            if(y+k <= 5){
                mem++;
            }
        }
        System.out.println(mem/3);
    }
    
}
