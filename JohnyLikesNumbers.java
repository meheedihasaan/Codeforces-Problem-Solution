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
public class JohnyLikesNumbers {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        if(n%k == 0){
            System.out.println(n+k);
            return;
        }
        
        if(n < k){
            System.out.println(k);
        }
        else{
            int x = n%k;
            x = k-x;
            System.out.println(n+x);
        }
    }
    
}
