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
public class GoldenPlate {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int k = sc.nextInt();
        int ans = 0;
        while(h > 0 && w > 0 && k > 0){
            ans+=((w*2)+((h-2)*2));
            w-=4;
            h-=4;
            k--;
        }
        System.out.println(ans);
    }
    
}
