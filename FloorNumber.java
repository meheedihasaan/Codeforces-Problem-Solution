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
public class FloorNumber {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = n-2;
            if(n > 2){
                if(y%x == 0){
                    System.out.println((y/x)+1);
                }
                else{
                    System.out.println((y/x)+1+1);
                }
            }
            else{
                System.out.println(1);
            }
        }
    }   
    
}
