import java.util.Set;

public class AppQuadrado{
    
    public static void main(String[] args){
        Quadrado quadrado1 = new Quadrado(3);
        Quadrado quadrado2 = new Quadrado(4);
        Quadrado quadrado3 = new Quadrado(5);
        if(quadrado1.calcularArea() > quadrado2.calcularArea() && 
           quadrado1.calcularArea() > quadrado3.calcularArea()){
            System.out.println("A maior área é: " + quadrado1.calcularArea());
        }
        else if(quadrado2.calcularArea() > quadrado1.calcularArea() && 
            quadrado2.calcularArea() > quadrado3.calcularArea()){
            System.out.println("A maior área é: " + quadrado2.calcularArea());    
        }
        else
            System.out.println("A maior área é: " + quadrado3.calcularArea());
            
         

        
        
    
    }    
}
