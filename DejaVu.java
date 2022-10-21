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
public class DejaVu {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            StringBuilder s = new StringBuilder(sc.next());
            boolean flag = true;
            int x = 0;
            for (int i = s.length()-1; i >= 0; i--) {
                if(s.charAt(i)!= 'a'){
                    flag = false;
                    x = i;
                    break;
                }
            }
            
            if(flag){
               System.out.println("NO");
            }
            else{               
               s.insert(s.length()-1-x, 'a');
               System.out.println("YES");
               System.out.println(s);
            }
        }
    }
    
}
