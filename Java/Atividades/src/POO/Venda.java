package POO;
import java.util.Scanner;
public class Venda {   
    public void statusVenda(){
        
    }     
    

    public static void main(String[] args){
        Produto produto1 = new Produto("1", "Vassoura", 5, 10.00);
        Produto produto2 = new Produto("2", "Pá de lixo", 3, 15.00);
        Produto produto3 = new Produto("3", "Sacola de lixo", 100, 0.10);

        System.out.println("Restam " + produto1.getQuantidade() + " unidades de " + produto1.getNome());
        System.out.println("Restam " + produto2.getQuantidade() + " unidades de " + produto2.getNome());
        System.out.println("Restam " + produto3.getQuantidade() + " unidades de " + produto3.getNome());

        Item item1 = new Item("1", produto1, 3);
        Item item2 = new Item("2", produto2, 4);

        item1.vender();
        item2.vender();

        System.out.println("Restam " + produto1.getQuantidade() + " unidades de " + produto1.getNome());
        System.out.println("Restam " + produto2.getQuantidade() + " unidades de " + produto2.getNome());

        item1.imprimir();
        item2.imprimir();
        System.out.println("Existem: " + Produto.getContadorDeObjetos() + " Produtos cadastrados.");
    System.out.println();
    Scanner input = new Scanner(System.in);
    int numero = input.nextInt();
    int contador = 0;
    for(int i=1;i<=numero;i++){
        if(numero%i == 0){
            contador++;
        }
    }
    if(contador==2){
        System.out.println("numero " + numero + " é primo.");
    }
    else
        System.out.println("numero " + numero + " não é primo.");
    
    
    }
}



