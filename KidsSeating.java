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
public class KidsSeating {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            int x = 0;
            for (int i = 4*n; i >= 0; i-=2) {
                System.out.print(i+" ");
                x++;
                if(x == n){
                   break;
                }
            }
            System.out.println();
        }
    }
    
}
