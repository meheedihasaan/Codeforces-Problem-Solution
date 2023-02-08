/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rating_800;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class IWannaBeTheGuy1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int p = input.nextInt();
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < p; i++) {
            set.add(input.nextInt());
        }
        
        int q = input.nextInt();
        for (int j = 0; j < q; j++) {
            set.add(input.nextInt());
        }
        
//        int temp = 0;
//        for (int k = 1; k <= n; k++) {
//            if(set.contains(k)){
//                
//            }
//            else{
//                temp++;
//                break;
//            }
//        }
        
        //HashSet doesn'n contain duplicate element.
        
        if(set.size() == n){
            System.out.println("I become the guy.");
        }
        else{
            System.out.println("Oh, my keyboard!");
        }
    }
    
}
