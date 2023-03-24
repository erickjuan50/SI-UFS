package POO.Exercicios.Funcionario;
public class Funcionario {
    private String nome;
    private String sexo;
    private String departamento;
    private double salario;

public Funcionario(String nome, String sexo, String departamento, double salario){
    this.nome = nome;
    this.sexo = sexo;
    this.departamento = departamento;
    this.salario = salario;
}
public String getNome() {
    return nome;
}
public String getSexo() {
    return sexo;
}
public String getDepartamento() {
    return departamento;
}
public double getSalario() {
    return salario;
}
public void setNome(String nome) {
    this.nome = nome;
}
public void setSexo(String sexo) {
    this.sexo = sexo;
}
public void setDepartamento(String departamento) {
    this.departamento = departamento;
}
public void setSalario(double salario) {
    this.salario = salario;
}
public void promover(double valorBonus){
    setSalario(getSalario() + valorBonus);
}
public double calcularSA(){
    return this.salario * 13;
}
}
