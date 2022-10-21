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
public class ChangingVolume {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = Math.abs(a-b);
            
            
            if(c == 0){
                System.out.println(0);
            }
            else{
                int count = 0;
                if(c >= 5){
                    count += (c/5);  //For 5
                    c = c%5;
                }

                if(c >= 2){
                    count += (c/2);  //For 2
                    c = c%2;
                }

                if(c == 1){
                    count = count+1;  //For 1
                }
                System.out.println(count);
            }
        }
    }
    
}
