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
public class BoxIsPull {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            if(x1 == x2 || y1 == y2){
                System.out.println(Math.abs(x1-x2)+Math.abs(y1-y2));
            }
            else{
                System.out.println(Math.abs(x1-x2)+Math.abs(y1-y2)+2);
            }
        }
    }
    
}
