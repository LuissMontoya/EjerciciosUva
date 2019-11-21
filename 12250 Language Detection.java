
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cr = new Scanner(System.in);
        int cont = 0;
        while (true) {
            cont++;
            String texto = cr.next();
            if (texto.equals("#")) {
                break;
            }
            switch (texto) {
                case "HELLO":
                    System.out.println("Case " + (cont) + ":" + " ENGLISH");
                    break;
                case "HOLA":
                    System.out.println("Case " + (cont) + ":" + " SPANISH");
                    break;
                case "HALLO":
                    System.out.println("Case " + (cont) + ":" + " GERMAN");
                    break;

                case "BONJOUR":
                    System.out.println("Case " + (cont) + ":" + " FRENCH");
                    break;
                case "CIAO":
                    System.out.println("Case " + (cont) + ":" + " ITALIAN");
                    break;
                case "ZDRAVSTVUJTE":
                    System.out.println("Case " + (cont) + ":" + " RUSSIAN");
                    break;
                case "#":
                    break;
                default:
                    System.out.println("Case " + (cont) + ":" + " UNKNOWN");
                    break;
            }
        }
    }
}
