package Paquete;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cr = new Scanner(System.in);
        int t = 0;
        t = cr.nextInt();
        int salario[]=new int[3];

        if( t >0 && t<20 ){

            //Salario en el rango de 1.000 y 10.000
            for (int i = 0; i < t; i++) {
                salario[0] = cr.nextInt();
                salario[1] = cr.nextInt();
                salario[2] = cr.nextInt();

                Arrays.sort(salario);
                System.out.println("Case "+(i+1)+": "+salario[1]);
            }
        }
    }
}
