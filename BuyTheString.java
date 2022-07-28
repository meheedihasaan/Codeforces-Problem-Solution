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
public class BuyTheString {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            int c0 = sc.nextInt();
            int c1 = sc.nextInt();
            int h = sc.nextInt();
            String s = sc.next();
            int zero = 0;
            int one = 0;
            for (int i = 0; i < n; i++) {
                if(s.charAt(i) == '0'){
                    zero++;
                }
                else{
                    one++;
                }
            }

            int x = zero*Math.min(c0, c1+h);
            int y = one*Math.min(c1, c0+h);
            System.out.println(x+y);
        }
    }
    
}
