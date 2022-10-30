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
public class FoxAndSnake {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int a = input.nextInt();
        int b = input.nextInt();
        
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                if(i%4==0){
                    if(j == 1){
                        System.out.print("#");
                    }
                    else{
                        System.out.print(".");
                    }
                }
                else if(i%4 == 2){
                    if(j == b){
                        System.out.print("#");
                    }
                    else{
                        System.out.print(".");
                    }
                }
                else{
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
    
}
