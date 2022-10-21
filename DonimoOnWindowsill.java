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
public class DonimoOnWindowsill {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            int k1 = sc.nextInt();
            int k2 = sc.nextInt();
            int w = sc.nextInt();
            int b = sc.nextInt();
            
            if(w == 0 && b == 0){
                System.out.println("YES");
            }
            else{
                int x = k1+k2;
                int y = (2*n) - (k1+k2);                
                int z = x/2 + y/2;
                
                if(x/2 >= w && y/2 >= 2){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }           
            }
        }
    }
    
}
