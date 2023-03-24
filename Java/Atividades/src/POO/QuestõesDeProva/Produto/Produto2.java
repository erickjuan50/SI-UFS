package POO.QuestõesDeProva.Produto;
import java.util.Set;

public class Produto2 {
    private String nome;
    private double precoCusto;
    private double precoVenda;
public Produto2(String nome, double precoCusto, double precoVenda){
    this.nome = nome;
    this.precoCusto = precoCusto;
    this.precoVenda = precoVenda;
}
    public String getNome() {
        return nome;
    }
    public double getPrecoCusto() {
        return precoCusto;
    }
    public double getPrecoVenda() {
        return precoVenda;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }
    public void setPrecoVenda(double precoVenda) {
        if(this.precoVenda >= this.precoCusto){
        this.precoVenda = precoVenda;
        }
        else
            System.out.println("Erro:O valor inserido é menor que o preço de custo");
    }
    public double calcularMargemLucro(){
        return getPrecoVenda() - getPrecoCusto();
    }
    public double getMargemLucroPorcentagem(){
        return (calcularMargemLucro()/getPrecoVenda()) * 100;
    }
}
