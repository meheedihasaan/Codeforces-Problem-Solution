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
public class GotAnyGrapes {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int g = sc.nextInt();
        int p = sc.nextInt();
        int b = sc.nextInt();
        if(g >= x){
            if((g-x)+p >= y && (g-x+p-y+b) >= z ){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        else{
            System.out.println("NO");
        }
    }
    
}
