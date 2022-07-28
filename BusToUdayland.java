/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rating_800;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class BusToUdayland {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> sit = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            sit.add(sc.next());
        }
        
        int count = 0;
        String s = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                if(sit.get(i).charAt(j) == 'O' && sit.get(i).charAt(j+1) == 'O'){
                    s = sit.get(i);
                    if(j == 0){
                        s = "++|" + s.substring(j+3, j+5);
                    }
                    else{
                        s = s.substring(j-3, j-1) + "|++";
                    }
                    sit.set(i, s);
                    count++;
                    break;
                }
            }
            if(count > 0){
                break;
            }
        }
        
        if(count > 0){
            System.out.println("YES");
            for (int i = 0; i < sit.size(); i++) {
                System.out.println(sit.get(i));
            }
        }
        else{
            System.out.println("NO");
        }
    }
    
}
