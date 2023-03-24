package POO.QuestõesDeProva.Produto;

public class AppVendas {
    public static void main(String[] args) {
        Produto2 produto1 = new Produto2("Chocolate", 2.50, 7.50);
        Produto2 produto2 = new Produto2("Pirulito", 0.15, 0.75);
        Produto2 produto3 = new Produto2("Goiabada", 2.50, 5.99);
        
        System.out.println("Preço de custo: " + "R$" +produto1.getPrecoCusto() + "\n"
                            + "Preço de venda: " + "R$" + produto1.getPrecoVenda() + "\n" 
                            + "Margem de lucro em moeda: " + "R$" + produto1.calcularMargemLucro() + "\n"
                            + "Margem de lucro em porcentagem: " + produto1.getMargemLucroPorcentagem() + "%" + "\n"
                            + "____________________________________");
        System.out.println("Preço de custo: " + "R$" +produto2.getPrecoCusto() + "\n"
                            + "Preço de venda: " + "R$" + produto2.getPrecoVenda() + "\n" 
                            + "Margem de lucro em moeda: " + "R$" + produto2.calcularMargemLucro() + "\n"
                            + "Margem de lucro em porcentagem: " + produto2.getMargemLucroPorcentagem() + "%" + "\n"
                            + "____________________________________");
        
        System.out.println("Preço de custo: " + "R$" +produto3.getPrecoCusto() + "\n"
                            + "Preço de venda: " + "R$" + produto3.getPrecoVenda() + "\n" 
                            + "Margem de lucro em moeda: " + "R$" + produto3.calcularMargemLucro() + "\n"
                            + "Margem de lucro em porcentagem: " + produto3.getMargemLucroPorcentagem() + "%" + "\n"
                            + "___________________________________");
                            
    }
    
}
