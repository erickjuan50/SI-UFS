package POO.Exercicios.Produto1;
public class Produto {
    protected String codigo;
    protected String nome;
    protected int quantidade;
    protected double preco;

    
    public Produto(String codigo, String nome, int quantidade, double preco){
        this.codigo = codigo;
        this.nome = nome;
        if(quantidade <0){
            this.quantidade = 0;
        }
        else
            this.quantidade = quantidade;
        this.preco = preco;
    }

    public void imprimirTeste(){
        System.out.println("1");
    }
    public String getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public double getPreco() {
        return preco;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

}

