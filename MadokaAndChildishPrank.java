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
public class MadokaAndChildishPrank {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            char ch[][] = new char[n][m];
            for (int i = 0; i < n; i++) {
                ch[i] = sc.next().toCharArray();
            }
            
            if(ch[0][0] == '1'){
                System.out.println(-1);
                continue;
            }
            
            ArrayList<int[]> result = new ArrayList<>();
            for (int i = n-1; i >= 0; i--) {
                for (int j = m-1; j >= 0; j--) {
                    if(ch[i][j] == '1'){
                        if(j > 0){
                            result.add(new int[]{i+1, j-1+1, i+1, j+1});
                        }
                        else{
                            result.add(new int[]{i-1+1, j+1, i+1, j+1});
                        }
                    }
                }
            }
            
            System.out.println(result.size());
            for (int i = 0; i < result.size(); i++) {
                int arr[] = result.get(i);
                System.out.println(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]);
            }
        }
    }
    
}
