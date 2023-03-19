import java.util.Arrays;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        //ordenamiento(1,6,3,"b");
        //ordenamiento("a");



    }

    public static void ordenamiento(String orden){

        Scanner leer = new Scanner(System.in);
        int numeros[] =new int[3];

        for(int i=0;i<numeros.length;i++){
            System.out.println("ingrese numero " + (i+1));

            numeros[i]= leer.nextInt();
        }

        System.out.println("ingrese orden");

        if(orden =="a"){
            Arrays.sort(numeros);
            for(int i = 0;i < numeros.length; i++){
                System.out.println(numeros[i]);
            }
        } else if (orden == "b") {
            Arrays.sort(numeros);
            for(int i= numeros.length-1; i >= 0; i--) {
                System.out.println(numeros[i]);
            }
        }
    }



}