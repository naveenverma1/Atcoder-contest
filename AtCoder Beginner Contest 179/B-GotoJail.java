import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int t = sc.nextInt();
int count =0;
boolean ok = false;
while(t-->0){
    int a = sc.nextInt();
    int b = sc.nextInt();
if((Math.abs(a-b)) ==0){
count++;
if(count>=3){
    ok = true;
    break;
}
}else{
    count =0;
}
    

}
if(ok){
    System.out.println("Yes");
}else{
    System.out.println("No");
}

    }
}