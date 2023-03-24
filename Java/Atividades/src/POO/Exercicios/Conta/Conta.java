package POO.Exercicios.Conta;
public class Conta {
    private String nome;
    private String numeroDaConta;
    private double saldo;
    private double limite;
public Conta(String nome, String numeroDaConta, double saldo, double limite){
    this.nome = nome;
    this.numeroDaConta = numeroDaConta;
    this.saldo = saldo;
    if(this.limite >= 940){
        this.limite = 940;
    }
}
public double getLimite() {
    return limite;
}
public String getNome() {
    return nome;
}
public String getNumeroDaConta() {
    return numeroDaConta;
}
public double getSaldo() {
    return saldo;
}
public void setLimite(double limite) {
    this.limite = limite;
}
public void setNome(String nome) {
    this.nome = nome;
}
public void setNumeroDaConta(String numeroDaConta) {
    this.numeroDaConta = numeroDaConta;
}
public void setSaldo(double saldo) {
    this.saldo = saldo;
}
public void depositar(double valorDoDeposito){
    setSaldo(getSaldo() + valorDoDeposito);
}
public boolean sacar(double valorDoSaque){
    if(valorDoSaque <= getSaldo()){
        setSaldo(getSaldo() - valorDoSaque);
        return true;
    }
    else
        return false;
}
}
