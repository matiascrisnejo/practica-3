import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
        String texto = "hala";
        int contador = 0;

        for(int indice=0;indice<texto.length();indice++) {
            if (texto.charAt(indice) == 'a') {
                contador += 1;
            }
        }
            System.out.println(contador);
        */

/*
        int num1 = 1;
        int num2 = 3;
        int num3 = 2;
        boolean esAscendente = false;

        int numeros[] = new int [3];

        if(esAscendente) {
            numeros[0] = num1;
            numeros[1] = num3;
            numeros[2] = num2;
        }
        else{
            numeros[0] = num2;
            numeros[1] = num3;
            numeros[2] = num1;
        }

        for(int i=0; i<numeros.length; i++){
            System.out.println(numeros[i]);
        }
*/
        /*
        int numeros2 [] = new int[]{4,6,8};
        int cont = 0;
        int x = 5;

        for(int ind = 0; ind<numeros2.length;ind++){
            if(numeros2[ind] > x){
                cont += numeros2[ind];
            }
        }
        System.out.println(cont);
        */
        String dic = "abcdefghijklmnopqrstuvwxyz ";
        String mensaje = "ahola que tal";
        String mensajeFinal = "";
        char letraABuscar;
        for(int indice=0;indice<mensaje.length();indice++){
            letraABuscar = mensaje.charAt(indice);
            for(int ind = 0;ind<dic.length();ind++){
                if(dic.charAt(ind) == letraABuscar){
                    System.out.println(String.valueOf(dic.charAt(ind+2)));

                }
            }
        }

        System.out.println(mensajeFinal);




    }
}