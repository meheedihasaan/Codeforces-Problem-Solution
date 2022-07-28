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
public class AngryStudents1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            int count = 0;
            int max = 0;
            boolean flag = false;
            for (int i = 0; i < n; i++) {
                if(s.charAt(i) == 'P'){
                    count++;
                }
                else{
                    if(flag){
                        max = Math.max(count, max);
                    }
                    flag = true;
                    count = 0;
                }
            }
            
            if(flag){
                max = Math.max(count, max);
            }
            
            System.out.println(max);
        }
    }
    
}
