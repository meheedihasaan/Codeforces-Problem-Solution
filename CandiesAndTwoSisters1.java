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
public class CandiesAndTwoSisters1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        int[] arr = new int[T];
        for (int i = 0; i < T; i++) {
            arr[i] = input.nextInt();
            if(arr[i] == 1 && arr[i] == 2){
                System.out.println(0);
            }
            else{
                System.out.println((arr[i]-1)/2);
            }
        }
    }
}
