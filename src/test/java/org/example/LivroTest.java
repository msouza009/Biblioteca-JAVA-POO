package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LivroTest {

    Livro livro = new Livro("Casmurro", "Machado", "1899");
    @Test
    public void testGetTitulo() {
        assertEquals("Casmurro", livro.getTitulo());
    }
}
