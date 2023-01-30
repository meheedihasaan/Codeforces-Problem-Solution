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
public class GregsWorkout {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int chest = 0;
        int biceps = 0;
        int back = 0;
        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            if(i%3 == 1){
                chest+=x;
            }
            else if(i%3 == 2){
                biceps+=x;
            }
            else if(i%3 == 0){
                back+=x;
            }
        }
        
        if(chest >= biceps && chest >= back){
            System.out.println("chest");
        }
        else if(biceps >= back && biceps >= back){
            System.out.println("biceps");
        }
        else{
            System.out.println("back");
        }
    }
    
}
