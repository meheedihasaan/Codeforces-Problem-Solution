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
public class LastYearSubstring {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            boolean flag = false;
            for (int i = 0; i <= 4; i++) {
                String s1 = s.substring(0, i);
                String s2 = s.substring(n-4+i, n);
                String s3 = s1+s2;
                if(s3.equals("2020")){
                    flag = true;
                    break;
                }
            }
            
            if(flag){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    
}
