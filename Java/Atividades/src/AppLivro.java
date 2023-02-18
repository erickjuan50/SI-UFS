public class AppLivro {
    public static void main(String[] args){
        Livro livro1 = new Livro("1", "Harry Potter e a Pedra Filosofal", 4);
        Livro livro2 = new Livro("2", "Harry Potter e a Camara Secreta", 7);
        Livro livro3 = new Livro("3", "Harry Potter e a Camara Secreta", 3);
    System.out.println(livro1.getQuantidade());
    System.out.println(livro2.getQuantidade());
    System.out.println(livro3.getQuantidade());
    
    livro1.setQuantidade(3);
    livro2.setQuantidade(5);
    livro3.setQuantidade(4);
    
    System.out.println(livro1.getQuantidade());
    System.out.println(livro2.getQuantidade());
    System.out.println(livro3.getQuantidade());
    }

    
}
