import java.util.*;
public class Main{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
   int r=0;;
int low = 1000;
int m = n%low;
if(m==0){
    System.out.println(0);
}else{
 r = 1000-m;
 System.out.println(r);
}


}
}