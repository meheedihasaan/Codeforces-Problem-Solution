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
public class InSearchOfAnEasyProblem {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        
        for (int j = 0; j < n; j++) {
            if(arr[j] == 1){
                count++;
            }
        }
        if (count > 0) {
            System.out.println("HARD");
        }
        else{
            System.out.println("EASY");
        }
    }
    
}
