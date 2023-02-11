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
public class LCMProblem {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            if(2*l <= r){
                System.out.println(l +" "+ 2*l);
            }
            else{
                System.out.println(-1 +" "+ -1);
            }
        }
    }
    
}
