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

    public void emprestar(){}
    public  void devolver(){}
}
