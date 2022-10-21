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
public class CaptainFlintAndCrewRecruitment {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            if(n <= 30){
                System.out.println("NO");
            }
            else if(n == 36 || n == 40 || n == 44){
                System.out.println("YES");
                System.out.println(6+" "+10+" "+15+" "+(n-(6+10+15)));
            }
            else{
                System.out.println("YES");
                System.out.println(6+" "+10+" "+14+" "+(n-(6+10+14)));
            }
        }
        
    }
    
}
