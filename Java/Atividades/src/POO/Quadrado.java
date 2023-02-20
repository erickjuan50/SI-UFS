package POO;
public class Quadrado {
    
    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    public void setLado(double lado) {
    this.lado = lado;
    }

    public double getLado() {
        return lado;
    }
    public double calcularArea(){
        return lado*lado;
    }
    public double calcularPerimetro(){
        return lado*4;
    }
}
