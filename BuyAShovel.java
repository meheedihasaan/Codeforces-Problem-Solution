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
public class BuyAShovel {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int count = 0;
        boolean s = true;
        while(s){
            count++;
            int c = count*a;
            if(c%10 == 0 || c%10 == b){
                s = false;
            }
        }
        System.out.println(count);
    }
    
}
