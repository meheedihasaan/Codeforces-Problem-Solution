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
public class IsYourHorseshoeOntheOtherHoof {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long[] arr = new long[4];
        int count = 0;
        
        for (int i = 0; i < 4; i++) {
            arr[i] = input.nextLong();
        }
        
        for (int j = 0; j < 4; j++) {
            for (int k = j+1; k <4 ; k++) {
                if(arr[j] == arr[k] ){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
    
}
