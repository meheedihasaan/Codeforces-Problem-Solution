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
public class FreeIceCream {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long x = sc.nextLong();
        sc.nextLine();
        long count = 0;
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] arr = s.split("\\s+"); 
            int y = Integer.valueOf(arr[1]);
            
            if(arr[0].equals("+")){
                x = x+y;
            }
            else if(arr[0].equals("-")){
                if(x - y >= 0){
                    x = x-y;
                }
                else if(x < y){
                    count++;
                }
            }
            
        }
        System.out.println(x+" "+count); 
    }
    
}
