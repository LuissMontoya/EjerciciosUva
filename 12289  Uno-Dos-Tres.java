
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String three = "three";
        Scanner cr = new Scanner(System.in);
        int t = cr.nextInt();
        for (int i = 0; i < t; i++) {
            String letra = cr.next();
            if (letra.length() == three.length()) {
                System.out.println(3);
            } else if ((letra.contains("o") && letra.contains("n") || letra.contains("e"))) {
                System.out.println(1);
            } else if ((letra.contains("t") || letra.contains("w") || letra.contains("o"))) {
                System.out.println(2);
            } 
        }
    }

}
