/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rating_800;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class BalancedArray {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            ArrayList<Integer> arr = new ArrayList<Integer>();
            int sumEven = 0;
            int sumOdd = 0;
            int n = input.nextInt();
            if(n%2 == 0){
                if(n%4 == 0){
                    System.out.println("YES");
                    for (int j = 1; j <= n; j++) {
                        if(j%2 == 0){
                            arr.add(j);
                            sumEven+=j;
                        }
                    }
                    
                    for (int j = 1; j <= n; j++) {
                        if(j%2 != 0){
                            arr.add(j);
                            sumOdd+=j;
                        }
                    }
                    
                    int x = sumEven - sumOdd;
                    int y = arr.get(arr.size()-1) +x;
                    arr.set(arr.size()-1, y);
                    for (int iterator : arr) {
                        System.out.print(iterator +" ");
                    }
                    System.out.println();
                }
                else{
                    System.out.println("NO");
                }
            }
        }
    }
    
}
