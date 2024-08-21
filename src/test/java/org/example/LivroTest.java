package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class LivroTest {

    Livro livro = new Livro("Casmurro", "Machado", "1899");
    @Test
    public void testGetTitulo() {
        assertEquals("Casmurro", livro.getTitulo());
    }

    @Test
    public void testGetAnoPublicacao(){
        assertEquals("1899", livro.getAnoPublicacao());
    }

    @Test
    public void testGetAutor(){
        assertEquals("Machado", livro.getAutor());
    }

    @Test
    public void testGetDisponibilidade(){
        assertTrue(livro.isDisponibilidade());
    }

    @Test
    public void testEmprestar(){
        assertTrue(livro.isDisponibilidade());
        livro.emprestar();
        assertFalse(livro.isDisponibilidade());
    }
}
