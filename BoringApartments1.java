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
public class BoringApartments1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int total = 0;
            for (int j = 1; j <= 9; j++) {
                int sum = 0;
                for (int k = 1; k <= 4; k++) {
                    sum = sum*10+j;
                    total+= k;
                    if(sum == n){
                        System.out.println(total);
                        break;                       
                    }
                }
            }           
        }
    }
    
}
