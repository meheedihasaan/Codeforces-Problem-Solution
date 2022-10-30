package Rating_800;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class FixYou {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            char[][] ch = new char[n][m];
            for (int i = 0; i < n; i++) {
                String s = sc.next();
                ch[i] = s.toCharArray();
            }
            
            int count = 0;
            for (int i = 0; i < n; i++) {
                if(ch[i][m-1] == 'R'){
                    count++;
                }
            }
            
            for (int i = 0; i < m; i++) {
                if(ch[n-1][i] == 'D'){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
    
}
