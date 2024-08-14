package org.example;

public class Biblioteca {

    public static  void main(String[] args){
        //livros
        Livro livro1 = new Livro("Dom casmurro", "Machado de Assis", "2023");
        Livro livro2 = new Livro("Código Limpo", "Não sei", "2000");

        System.out.println("Qual é o titulo ? " + livro1.getTitulo());
        System.out.println("Qual é o autor ? " + livro1.getAutor());
        System.out.println("Qual é o ano ? " + livro1.getAnoPublicacao());
        System.out.println("O livro está disponivel? " + livro1.isDisponibilidade());
    }
}
