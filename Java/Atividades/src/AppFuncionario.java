public class AppFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("João Pedro Brandão", "Masculino", "DCOMP", 1800);
        System.out.println(funcionario1.getSalario());
        funcionario1.promover(200);
        System.out.println(funcionario1.getSalario());
        System.out.println(funcionario1.calcularSA());
    }
    
}
