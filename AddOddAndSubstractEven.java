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
public class AddOddAndSubstractEven {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = Math.abs(a-b);
            int move = 0;
            if(a == b){
                move = 0;
            }
            else if(a > b){
                if(c%2 == 0){
                    move = 1;
                }
                else{
                    move = 2;
                }
            }
            else if(b > a){
                if(c%2 == 0){
                    move = 2;
                }
                else{
                    move = 1;
                }
            }
            System.out.println(move);
        }
    }
    
}
