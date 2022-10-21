package Rating_800;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class DiverseTeam {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if(!map.containsKey(x)){
                map.put(x, i+1);
            }
        }
        
        if(map.size() >= k){
            System.out.println("YES");
            int j = 0;
            for (int i : map.keySet()) {
                if(j == k) break;
                System.out.print(map.get(i)+" ");
                j++;
            }
            System.out.println();
        }
        else{
            System.out.println("NO");
        }
    }
    
}
