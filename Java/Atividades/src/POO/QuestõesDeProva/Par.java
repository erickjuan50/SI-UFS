package POO.QuestõesDeProva;
import java.util.*;
public class Par{
    public static void main(String[] args) {
        
    
        Scanner entrada1 = new Scanner(System.in);
        int nInicial = entrada1.nextInt();
        Scanner entrada2 = new Scanner(System.in);
        int nFinal = entrada2.nextInt();
        int contadorPar = 0;

        for(int i = nInicial;i<=nFinal;i++){
            if(i%2 == 0 && i>=0){
                contadorPar++;
            }
        }

        int contadorIndice = 0;
        int [] nPares = new int [contadorPar];
        for(int i = nInicial;i<=nFinal;i++){
            if(i%2 == 0 && i>=0){
                nPares[contadorIndice] = i;
                contadorIndice++;
            }
        }
    System.out.println(Arrays.toString(nPares));
}
}
