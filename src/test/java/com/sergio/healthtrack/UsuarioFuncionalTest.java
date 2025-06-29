package com.sergio.healthtrack;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class UsuarioFuncionalTest {
    @Test
    public void flujoActualizaPeso() {

        Usuario usuario = new Usuario("Sergio", 74.5);

        usuario.actualizarPeso(71.2);

        assertEquals(71.2, usuario.getPeso(), 0.01);
    }

}
