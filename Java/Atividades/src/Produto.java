public class Produto {
    private String codigo;
    private String nome;
    private int quantidade;
    private String preco;

    public Produto(String codigo, String nome, int quantidade, String preco){
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
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
    public String getPreco() {
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
    public void setPreco(String preco) {
        this.preco = preco;
    }

}

