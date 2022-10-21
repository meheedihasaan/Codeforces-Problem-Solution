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
public class CandiesAndTwoSisters {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        //int x;
        for (int i = 0; i < T; i++) {
            int n = input.nextInt();
            if(n == 1 || n == 2){
                System.out.println(0);
            }
            else{
                System.out.println((n-1)/2);
            }
        }
    }
    
}
