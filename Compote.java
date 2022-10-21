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
public class Compote {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= a; i++) {
            int x = i*2;
            int y = i*4;
            if(x > b || y > c){
                break;
            }
            count = i+x+y;          
        }
        System.out.println(count);
    }
    
}
