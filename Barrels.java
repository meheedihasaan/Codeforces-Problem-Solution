/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rating_800;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Barrels {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            ArrayList<Long> arr = new ArrayList<Long>();
            for (int i = 0; i < n; i++) {
                arr.add(sc.nextLong());
            }

            Collections.sort(arr, Collections.reverseOrder());

            int j = 1;
            for (int i = 1; i <= k; i++) {
                long x = arr.get(0);
                long y = arr.get(j);
                arr.set(0, x+y);
                arr.set(j, y-y);
                j++;
            }

            System.out.println(Collections.max(arr)-Collections.min(arr));
        }
    }
    
}
