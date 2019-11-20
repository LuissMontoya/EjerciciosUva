
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cr = new Scanner(System.in);
        int n = 0;
        while (true) {
            n++;
            String aux = cr.next();
            if (aux.equals("Hajj")) {
                System.out.println("Case " + (n) + ":" + " Hajj-e-Akbar");
            }
            if (aux.contains("Umrah")) {
                System.out.println("Case " + (n) + ":" + " Hajj-e-Asghar");
            }
            if ("*".equals(aux)) {
                break;
            }
        }
    }
}
