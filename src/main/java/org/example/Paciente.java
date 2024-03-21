package org.example;

import java.util.Date;

public class Paciente {

    private String cpf;
    private String nome;
    private Date dataNascimento;
    private String tipoSanguineo;
    private String estadoCivil;
    private String telefone;
    private int enderecoNumero;
    private String enderecoComplemento;
    private String enderecoBairro;
    private String enderecoCidade;
    private String enderecoUF;
    private String cep;
    private String email;

    public Paciente() {
        this.enderecoNumero = 0;
        this.nome = "";
        this.email = "";
        this.cpf = "";
        this.tipoSanguineo = "";
    }

    public String getCpf() {
        return cpf;
    }

    public Paciente setCpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public Paciente setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
        return this;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public Paciente setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
        return this;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public Paciente setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
        return this;
    }

    public String getTelefone() {
        return telefone;
    }

    public Paciente setTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public int getEnderecoNumero() {
        return enderecoNumero;
    }

    public Paciente setEnderecoNumero(int enderecoNumero) {
        this.enderecoNumero = enderecoNumero;
        return this;
    }

    public String getEnderecoComplemento() {
        return enderecoComplemento;
    }

    public Paciente setEnderecoComplemento(String enderecoComplemento) {
        this.enderecoComplemento = enderecoComplemento;
        return this;
    }

    public String getEnderecoBairro() {
        return enderecoBairro;
    }

    public Paciente setEnderecoBairro(String enderecoBairro) {
        this.enderecoBairro = enderecoBairro;
        return this;
    }

    public String getEnderecoCidade() {
        return enderecoCidade;
    }

    public Paciente setEnderecoCidade(String enderecoCidade) {
        this.enderecoCidade = enderecoCidade;
        return this;
    }

    public String getEnderecoUF() {
        return enderecoUF;
    }

    public Paciente setEnderecoUF(String enderecoUF) {
        this.enderecoUF = enderecoUF;
        return this;
    }

    public String getCep() {
        return cep;
    }

    public Paciente setCep(String cep) {
        this.cep = cep;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Paciente setEmail(String email) {
        this.email = email;
        return this;
    }
}
