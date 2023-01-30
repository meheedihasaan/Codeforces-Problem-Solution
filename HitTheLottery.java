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
public class HitTheLottery {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = 0;
        
        count += n/100;
        n = n%100;
        
        count += n/20;
        n = n%20;
        
        count += n/10;
        n = n%10;
        
        count += n/5;
        n = n%5;
        
        count += n/1;
        n = n%1;
        
        System.out.println(count);
    }
    
}
