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
public class InsomniaCure {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        int l = input.nextInt();
        int m = input.nextInt();
        int n = input.nextInt();
        int d = input.nextInt();
        int count = 0;
        for (int i = 1; i <= d; i++) {
            if(i%k==0|| i%l==0 || i%m==0 || i%n==0){
                count++;
            }
        }
        System.out.println(count);
    }
    
}
