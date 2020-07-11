import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testNum = sc.nextInt();
         String[] scoreName = new String[]{"AC", "WA", "TLE", "RE"};
        int[] score = new int[4];

        for (int i = 0; i < testNum+1; i++) {
            String temp = sc.nextLine();
               switch (temp) {
               case "AC" :
                    score[0]++;
                    break;
                 case "WA" :
                    score[1]++;
                    break;
                  case "TLE" :
                    score[2]++;
                    break;
                case "RE" :
                    score[3]++;
                            }
   }
        for(int i = 0; i<4; i++) {
            System.out.println(scoreName[i]+" x "+score[i]);
        }
        }
   }