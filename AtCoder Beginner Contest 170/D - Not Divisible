import java.util.*;
public class Main {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>();
    
    
    for(int i =0;i<n;i++){
        int a = sc.nextInt();
        if(map.containsKey(a)){
            map.put(a, map.get(a)+1);
			} else {
				map.put(a, 1);
			}
        }
        int max = map.lastKey();
        boolean[]  b = new boolean[max+1];
        for(int i =0;i<max+1;i++){
            b[i] = true;
        }
        
        for(int key :map.keySet()){
         if(b[key] == false){
             continue;
         }
             for(int i =2;i*key<=max;i++){
                 b[i*key] = false;
             
         }
        }
        
        int ans = 0;
        for(int key : map.keySet()){
            if (map.get(key) == 1 && b[key] == true){
				ans++;
			}
        }
        System.out.println(ans);
    }
    }
