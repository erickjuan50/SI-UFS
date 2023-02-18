public class Venda {   
    public void statusVenda(){
        
    }     
    

    public static void main(String[] args){
        Produto produto1 = new Produto("1", "Vassoura", 5,"R$10,00");
        Produto produto2 = new Produto("2", "Pá de lixo", 3,"R$15,00");
        Produto produto3 = new Produto("3", "Sacola de lixo", 100,"R$0,10");

        System.out.println("Restam " + produto1.getQuantidade() + " unidades de " + produto1.getNome());
        System.out.println("Restam " + produto2.getQuantidade() + " unidades de " + produto2.getNome());
        System.out.println("Restam " + produto3.getQuantidade() + " unidades de " + produto3.getNome());

        Item item1 = new Item("1", produto1, 2);
        Item item2 = new Item("2", produto2, 4);

        item1.vender();
        item2.vender();

        System.out.println("Restam " + produto1.getQuantidade() + " unidades de " + produto1.getNome());
        System.out.println("Restam " + produto2.getQuantidade() + " unidades de " + produto2.getNome());

    }
}
