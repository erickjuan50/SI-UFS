package POO;
public class Livro {
    private String codigo;
    private String nome;
    private int quantidade;
public Livro(String codigo, String nome, int quantidade){
    this.codigo = codigo;
    this.nome = nome;
    this.quantidade = quantidade;
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
public void setCodigo(String codigo) {
    this.codigo = codigo;
}
public void setNome(String nome) {
    this.nome = nome;
}
public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
}
}
