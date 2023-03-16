package Arrays;

import java.util.Scanner;

public class ListaParesImpares {
    public static void main(String[] args) {
        
    
    String[] nomes = new String [3];   //Metodo 1:  Tipo + [] + (nome da lista) = new Tipo + [Tamanho da lista];
    nomes[0] = "Maria";
    nomes[1] = "Pedro";
    nomes[2] = "João" ;

    int [] numeros2 = {0,2,5,14,75,23,51,1,8,7};    //Metodo 2: Tipo + [] + (nome da lista) = {valor1,valor2,valor3...};

    int [] numeros3 = new int[10];
    Scanner entrada = new Scanner(System.in);
    for(int i=0; i < 10; i++){
        numeros3[i] = entrada.nextInt();
    }
    for(int i = 0; i < numeros3.length; i++){
        if(numeros3[i]%2 == 0){
            System.out.println("Par: " + numeros3[i]);
        }
    }
    for(int i = 0; i < numeros3.length; i++){
        if(numeros3[i]%2 == 1){
            System.out.println("Impar: " + numeros3[i]);
        }
    }
    int contadorPar = 0;
    int contadorImpar = 0;
    for(int i = 0; i < numeros3.length;i++){
        if(numeros3[i]%2 == 0){
            contadorPar += 1;}
        if(i>=numeros3.length - 1){
            System.out.println("Numero de pares: " + contadorPar);
        }
    }
    for(int j = 0; j < numeros3.length;j++){
        if(numeros3[j]%2 == 1){
            contadorImpar += 1;}
        if(j>=numeros3.length - 1){
            System.out.println("Numero de impares: " + contadorImpar);
        }
        
    
    }
 
}
}

