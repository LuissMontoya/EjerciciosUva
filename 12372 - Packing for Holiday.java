
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner cr=new Scanner(System.in);
       int t=cr.nextInt();
        for (int i = 0; i < t; i++) {
            int l=cr.nextInt();
            int w=cr.nextInt();
            int h=cr.nextInt();
            if (l<=20 && w<=20 && h<=20) {
                System.out.println("Case "+(i+1)+":"+" good");
            }else   
                System.out.println("Case "+(i+1)+":"+" bad");
        }
    } 
}
