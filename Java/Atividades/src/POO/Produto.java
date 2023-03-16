package POO;
public class Produto {
    private String codigo;
    private String nome;
    private int quantidade;
    private double preco;
    private static int contadorDeObjetos = 0;

    
    public Produto(String codigo, String nome, int quantidade, double preco){
        contadorDeObjetos++;
        this.codigo = codigo;
        this.nome = nome;
        if(quantidade <0){
            this.quantidade = 0;
        }
        else
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
    public double getPreco() {
        return preco;
    }
    public static int getContadorDeObjetos() {
        return contadorDeObjetos;
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

