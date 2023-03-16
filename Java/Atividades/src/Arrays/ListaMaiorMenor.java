package Arrays;
import java.util.Scanner;
public class ListaMaiorMenor {
    
    public static void main(String[] args) {
        
    
    int [] numeros = new int[10];
    Scanner entrada = new Scanner(System.in);
    for(int i=0; i < 10; i++){
        numeros[i] = entrada.nextInt();
    }
    int maiorNumero = numeros[0];
    int menorNumero = numeros[0];
    for(int i=0; i < 10; i++){
        if(numeros[i] > maiorNumero){
            maiorNumero = numeros[i];
        }
    }
    for(int i=0; i < 10; i++){
        if(numeros[i] < menorNumero){
            menorNumero = numeros[i];
        }
    }
    System.out.println("Maior valor: " + maiorNumero);
    System.out.println("Menor Numero: " + menorNumero);
}
}
