/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package R849_Div4;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class FollowingDirection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            int x = 0;
            int y = 0;
            boolean flag = false;
            for(int i = 0; i < n; i++){
                if(s.charAt(i) == 'U'){
                    y++;
                }
                if(s.charAt(i) == 'D'){
                    y--;
                }
                if(s.charAt(i) == 'R'){
                    x++;
                }
                if(s.charAt(i) == 'L'){
                    x--;
                }
                if(x == 1 && y == 1){
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
