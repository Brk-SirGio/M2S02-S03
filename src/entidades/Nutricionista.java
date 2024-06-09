package entidades;

import java.util.ArrayList;
import java.util.List;

public class Nutricionista extends Funcionario {
    private List<String> certificacoes;
    private int numeroDeConsultas;
    private int tempoDeExperiencia;

    public Nutricionista() {
        certificacoes = new ArrayList<>();
    }

    public Nutricionista(String nome, int idade, Endereco endereco, double salario, int tempoDeExperiencia) {
        super(nome, idade, endereco, salario);
        this.certificacoes = new ArrayList<>();
        this.numeroDeConsultas = 0;
        this.tempoDeExperiencia = tempoDeExperiencia;
    }

    // Getters e Setters

    public List<String> getCertificacoes() {
        return certificacoes;
    }

    public void setCertificacoes(List<String> certificacoes) {
        this.certificacoes = certificacoes;
    }

    public int getNumeroDeConsultas() {
        return numeroDeConsultas;
    }

    public void setNumeroDeConsultas(int numeroDeConsultas) {
        this.numeroDeConsultas = numeroDeConsultas;
    }

    public int getTempoDeExperiencia() {
        return tempoDeExperiencia;
    }

    public void setTempoDeExperiencia(int tempoDeExperiencia) {
        this.tempoDeExperiencia = tempoDeExperiencia;
    }

    // Métodos adicionais

    public void adicionarAnoDeExperiencia() {
        this.tempoDeExperiencia++;
    }

    public void adicionarCertificacao(String certificacao) {
        this.certificacoes.add(certificacao);
    }
}
