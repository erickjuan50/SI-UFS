package POO.Exercicios.Conta;

public class AppConta {
    public static void main(String[] args) {
        Conta cliente1 = new Conta("João Pedro Brandão", "0409278539427139", 1500, 1200);
        Conta cliente2 = new Conta("Diogo Eduardo Alves Martins", "4012859374825930", 3000, 5000);
    System.out.println("Nome: " + cliente1.getNome() + "\n" + "Saldo: " + cliente1.getSaldo());

    cliente1.depositar(100);
    cliente1.sacar(50);
    
    System.out.println("Nome: " + cliente1.getNome() + "\n" + "Saldo: " + cliente1.getSaldo());
    
    
    }    
}
