import java.util.Scanner;
 
public class b{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s[] = new String[n];
        long t[] = new long[n]; 
        long max = 0;
        int maxnum = 0;
        long second = 0;
        int secondnum = 0;
 
        for(int i=0; i<n; i++){
            s[i] = scanner.next();
            t[i] = scanner.nextLong();
        }
 
        max = t[0];
 
        for(int j=1; j<n; j++){
            if(max < t[j]){
                second = max;
                secondnum = maxnum;
                max = t[j];
                maxnum = j;
            }else if(second < t[j]){
                second = t[j];
                secondnum = j;
            }
        }
 
 
        String ans = s[secondnum];
 
        System.out.println(ans);
    }
}