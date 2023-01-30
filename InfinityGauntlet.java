/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rating_800;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class InfinityGauntlet {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("purple", "Power");
        map.put("green", "Time");
        map.put("blue", "Space");
        map.put("orange", "Soul");
        map.put("red", "Reality");
        map.put("yellow", "Mind");
        
        System.out.println(6-arr.length);
        for (String s : map.keySet()) {
            boolean flag = true;
            for (int i = 0; i < n; i++) {
                if(s.equals(arr[i])){
                    flag = false;
                }
            }
            if(flag){
                System.out.println(map.get(s));
            }
        }
    }
    
}
