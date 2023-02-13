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
public double CalcularArea(){
    return lado*lado;
}
public double CalcularPerimetro(){
    return lado*4;
}
}
