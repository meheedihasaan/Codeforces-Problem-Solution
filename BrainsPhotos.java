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
public class BrainsPhotos {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] arr = new char[n][m];
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.next().charAt(0);
                if(arr[i][j] == 'C' || arr[i][j] == 'M' || arr[i][j] == 'Y'){
                    count++;
                }
            }
        }
        
        if(count == 0){
            System.out.println("#Black&White");
        }
        else{
            System.out.println("#Color");
        }
    }
    
}
