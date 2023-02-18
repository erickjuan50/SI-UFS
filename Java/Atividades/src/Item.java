public class Item {
    private String codigo;
    private Produto produto;
    private int quantiaVendida;
public Item(String codigo, Produto produto, int quantiaVendida){
    this.codigo = codigo;
    this.produto = produto;
    this.quantiaVendida = quantiaVendida;
}
public String getCodigo() {
    return codigo;
}
public Produto getProduto() {
    return produto;
}
public int getQuantiaVendida() {
    return quantiaVendida;
}
public void setCodigo(String codigo) {
    this.codigo = codigo;
}
public void setProduto(Produto produto) {
    this.produto = produto;
}
public void setQuantiaVendida(int quantiaVendida) {
    this.quantiaVendida = quantiaVendida;
}
public void vender(){
    this.produto.setQuantidade(this.produto.getQuantidade() - quantiaVendida);
}
}
