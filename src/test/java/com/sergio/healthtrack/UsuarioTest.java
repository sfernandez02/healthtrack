package com.sergio.healthtrack;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class UsuarioTest{
    @Test
    void actualizarPeso_deberiaAsignarNuevoValor() {
        Usuario usuario = new Usuario("Sergio", 75.0);
        usuario.actualizarPeso(72.5);
        assertEquals(72.5, usuario.getPeso());
    }

    @Test
    void getNombre_deberiaRetornarNombreCorrecto() {
        Usuario usuario = new Usuario("Sergio", 70.0);
        assertEquals("Sergio", usuario.getNombre());
    }

    @Test
    void getPeso_deberiaRetornarPesoInicial() {
        Usuario usuario = new Usuario("Sergio", 68.0);
        assertEquals(68.0, usuario.getPeso());
    }

}
