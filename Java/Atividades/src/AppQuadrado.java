import java.util.Set;

public class AppQuadrado{
    public static void main(String[] args){
        Quadrado quadrado1 = new Quadrado(7);
        Quadrado quadrado2 = new Quadrado(5);
        Quadrado quadrado3 = new Quadrado(6);
        System.out.println(quadrado1.CalcularArea());
        System.out.println(quadrado1.CalcularPerimetro());
        quadrado1.setLado(6);
        System.out.println(quadrado1.CalcularArea());
    }
}
