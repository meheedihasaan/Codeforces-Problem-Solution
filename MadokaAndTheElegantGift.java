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
public class MadokaAndTheElegantGift {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        k:
        while(T -- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            char arr[][] = new char[n][m];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.next().toCharArray();
            }
            
            for (int i = 0; i < n-1; i++) {
                int sum = 0;
                for (int j = 0; j < m-1; j++) {
                    sum = Character.getNumericValue(arr[i][j])+Character.getNumericValue(arr[i][j+1])+Character.getNumericValue(arr[i+1][j])+Character.getNumericValue(arr[i+1][j+1]);
                    if(sum == 3){
                        System.out.println("NO");
                        continue k;
                    }
                }
            }
            System.out.println("YES");
        }
    }
    
}
