package paquete;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cr = new Scanner(System.in);

        //cantidad de palabras
        int t= cr.nextInt();

        String arr[]= new String[t];

        if( t>0 && t<100){
            for (int j = 0; j < t ; j++) {
                arr[j] = cr.next();
            }
            for (int i = 0; i < t; i++) {


                if(arr[i].length()==5){
                    System.out.println("3");
                }else{
                    if(arr[i].length()==3){
                        if((arr[i].contains("o") && arr[i].contains("n"))
                                || arr[i].contains("o") && arr[i].contains("e")
                                || arr[i].contains("n") && arr[i].contains("e")){
                            System.out.println("1");
                        }else{
                        if(arr[i].contains("t") || arr[i].contains("w") || arr[i].contains("o")){
                            System.out.println("2");
                        }
                        }
                    }
                }

            }

        }
    }
}
