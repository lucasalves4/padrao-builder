package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PacienteBuilderTest {

    @Test
    void deveRetornarExcecaoParaPacienteSemNome() {
        try {
            PacienteBuilder pacienteBuilder = new PacienteBuilder();
            Paciente paciente = pacienteBuilder
                    .setEnderecoNumero(1254)
                    .setCpf("111.111.111-82")
                    .setTipoSanguineo("A+")
                    .setEmail("paciente1@email.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido!", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaPacientesSemNumero() {
        try {
            PacienteBuilder pacienteBuilder = new PacienteBuilder();
            Paciente paciente = pacienteBuilder
                    .setNome("Paciente 1")
                    .setCpf("111.111.111-82")
                    .setTipoSanguineo("A+")
                    .setEmail("paciente1@email.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Número inválido!", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaPacienteSemEmail() {
        try {
            PacienteBuilder pacienteBuilder = new PacienteBuilder();
            Paciente paciente = pacienteBuilder
                    .setEnderecoNumero(1254)
                    .setCpf("111.111.111-82")
                    .setTipoSanguineo("A+")
                    .setNome("Paciente 2")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("E-mail inválido!", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaPacienteSemTipoSanguineo() {
        try {
            PacienteBuilder pacienteBuilder = new PacienteBuilder();
            Paciente paciente = pacienteBuilder
                    .setEnderecoNumero(1254)
                    .setCpf("111.111.111-82")
                    .setNome("Paciente 2")
                    .setEmail("paciente1@email.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Tipo Sanguíneo inválido!", e.getMessage());
        }
    }


}