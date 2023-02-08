/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rating_800;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class IWannaBeTheGuy {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int p = input.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < p; i++) {
            arr.add(input.nextInt());
        }
        
        int q = input.nextInt();
        for (int j = 0; j < q; j++) {
            arr.add(input.nextInt());
        }
        
        int temp = 0;
        for (int k = 1; k <= n; k++) {
            if(arr.contains(k)){
                
            }
            else{
                temp++;
                break;
            }
        }
        
        if(temp==0){
            System.out.println("I become the guy.");
        }
        else{
            System.out.println("Oh, my keyboard!");
        }
    }
    
}
