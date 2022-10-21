/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rating_800;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class DistinctDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int ans = -1;
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int i = l; i <= r; i++) {
            String x = Integer.toString(i);
            for (int j = 0; j < x.length(); j++) {
                hs.add(Character.getNumericValue(x.charAt(j)));
            }
            if(hs.size() == x.length()){
                ans = i;
                break;
            }
            hs.clear();
        }
        System.out.println(ans);
    }
}
