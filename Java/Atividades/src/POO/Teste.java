package POO;
import java.util.Scanner;

public class Teste {
    Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();
        int indice = input.nextInt();
        /*for(int i=1;i<=10;i++){
            System.out.println(numero + "x" + i + "=" + numero*i);
        }*/

        int contador = 1;
        while(contador <= indice){
            System.out.println(numero + "x" + contador + "=" + numero*contador);
            contador++;
        }

    }
    
}
