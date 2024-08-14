package org.example;

public class Livro {
    private String titulo;
    private String autor;
    private String anoPublicacao;
    private boolean disponibilidade;

    // metodos
    public Livro(String titulo, String autor, String ano){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = ano;
        this.disponibilidade = true;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public String getAnoPublicacao() {
        return anoPublicacao;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void emprestar(){
        // se o livro esta disponivel
        if (disponibilidade){
            disponibilidade = false;
            System.out.println("O livro " + titulo + " foi emprestado");
        } else {
            System.out.println("O livro " + titulo + " não está disponivel");
        }
    }

    public  void devolver(){
        if (disponibilidade) {
            System.out.println("O livro " + titulo + " não foi emprestado");
        } else {
            disponibilidade = true;
            System.out.println("O livro " + titulo + " foi devolvido");
        }
    }
}
