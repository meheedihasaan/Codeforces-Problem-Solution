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
public class CardsForFriends {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int w = sc.nextInt();
            int h = sc.nextInt();
            int n = sc.nextInt();
            long total = 1;
            
            while(w%2 == 0){
                total*=2;
                w/=2;
            }
            while(h%2 == 0){
                total*=2;
                h/=2;
            }
            
            if(total >= n){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    
}
