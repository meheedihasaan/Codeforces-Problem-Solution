/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rating_800;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class AnotherSortingProblem {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.next());
            map.put(list.get(i), i+1);
        }
        
        Collections.sort(list, new Comparator <String>(){
            public int compare(String s1, String s2) {
                for (int i = 0; i < s1.length(); i++) {
                    int t = i+1;
                    if(s1.charAt(i) == s2.charAt(i)){
                        continue;
                    }
                    if(t%2 == 1){
                        return s1.charAt(i)-s2.charAt(i);
                    }
                    else{
                        return s2.charAt(i)-s1.charAt(i);
                    }
                }
                return 0;
            }
        });
        
        for (int i = 0; i < list.size(); i++) {
            System.out.print(map.get(list.get(i))+" ");
        }
        System.out.println();
    }
    
}