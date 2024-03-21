package org.example;

import java.util.Date;

public class PacienteBuilder {

    private Paciente paciente;

    public PacienteBuilder() {
        paciente = new Paciente();
    }

    public Paciente build() {
        if (paciente.getEnderecoNumero() == 0) {
            throw new IllegalArgumentException("Número inválido!");
        }
        if (paciente.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido!");
        }
        if (paciente.getEmail().equals("")) {
            throw new IllegalArgumentException("E-mail inválido!");
        }
        if (paciente.getCpf().equals("")) {
            throw new IllegalArgumentException("CPF inválido!");
        }
        if (paciente.getTipoSanguineo().equals("")) {
            throw new IllegalArgumentException("Tipo Sanguíneo inválido!");
        }
        return paciente;
    }

    public PacienteBuilder setCpf(String cpf) {
        paciente.setCpf(cpf);
        return this;
    }

    public PacienteBuilder setNome(String nome) {
        paciente.setNome(nome);
        return this;
    }

    public PacienteBuilder setDataNascimento(Date dataNascimento) {
        paciente.setDataNascimento(dataNascimento);
        return this;
    }

    public PacienteBuilder setTipoSanguineo(String tipoSanguineo) {
        paciente.setTipoSanguineo(tipoSanguineo);
        return this;
    }

    public PacienteBuilder setEstadoCivil(String estadoCivil) {
        paciente.setEstadoCivil(estadoCivil);
        return this;
    }

    public PacienteBuilder setTelefone(String telefone) {
        paciente.setTelefone(telefone);
        return this;
    }

    public PacienteBuilder setEnderecoNumero(int enderecoNumero) {
        paciente.setEnderecoNumero(enderecoNumero);
        return this;
    }

    public PacienteBuilder setEnderecoComplemento(String enderecoComplemento) {
        paciente.setEnderecoComplemento(enderecoComplemento);
        return this;
    }

    public PacienteBuilder setEnderecoBairro(String enderecoBairro) {
        paciente.setEnderecoBairro(enderecoBairro);
        return this;
    }

    public PacienteBuilder setEnderecoCidade(String enderecoCidade) {
        paciente.setEnderecoCidade(enderecoCidade);
        return this;
    }

    public PacienteBuilder setEnderecoUF(String enderecoUF) {
        paciente.setEnderecoUF(enderecoUF);
        return this;
    }

    public PacienteBuilder setCep(String cep) {
        paciente.setCep(cep);
        return this;
    }

    public PacienteBuilder setEmail(String email) {
        paciente.setEmail(email);
        return this;
    }
}
