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
public class Eleven {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(1);
        for (int i = 2; i <= n; i++) {
            int x = arr.get(i-2);
            int y = arr.get(i-1);
            arr.add(x+y);
        }
        
        
        String s = "";
        boolean flag = true;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < arr.size(); j++) {
                if(i == arr.get(j)){
                    s+='O';
                    flag = false;
                    break;
                }
                else{
                    flag = true;
                }
            }
            if(flag){
                s+='o';
            }
        }
        System.out.println(s);
    }
    
}
