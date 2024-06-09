package entidades;

import java.util.ArrayList;
import java.util.List;

public class Paciente {
    private String nome;
    private int idade;
    private double peso;
    private double altura;
    private double pressaoArterial;
    private double frequenciaCardiaca;
    private String dietaAlimentar;
    private List<String> atividadesFisicas;

    public Paciente() {
        atividadesFisicas = new ArrayList<>();
    }

    public Paciente(String nome, int idade, double peso, double altura, double pressaoArterial, double frequenciaCardiaca, String dietaAlimentar) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.pressaoArterial = pressaoArterial;
        this.frequenciaCardiaca = frequenciaCardiaca;
        this.dietaAlimentar = dietaAlimentar;
        this.atividadesFisicas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPressaoArterial() {
        return pressaoArterial;
    }

    public void setPressaoArterial(double pressaoArterial) {
        this.pressaoArterial = pressaoArterial;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getFrequenciaCardiaca() {
        return frequenciaCardiaca;
    }

    public void setFrequenciaCardiaca(double frequenciaCardiaca) {
        this.frequenciaCardiaca = frequenciaCardiaca;
    }

    public String getDietaAlimentar() {
        return dietaAlimentar;
    }

    public void setDietaAlimentar(String dietaAlimentar) {
        this.dietaAlimentar = dietaAlimentar;
    }

    public List<String> getAtividadesFisicas() {
        return atividadesFisicas;
    }

    public void setAtividadesFisicas(List<String> atividadesFisicas) {
        this.atividadesFisicas = atividadesFisicas;
    }

    // Método de cálculo do IMC
    public double calcularIMC() {
        return peso / (altura * altura);
    }

    // Método para monitoramento do paciente
    public String monitoramentoPaciente() {
        return "Nome: " + nome + "\n" +
                "Idade: " + idade + "\n" +
                "Peso: " + peso + "\n" +
                "Altura: " + altura + "\n" +
                "Pressão Arterial: " + pressaoArterial + "\n" +
                "Frequência Cardíaca: " + frequenciaCardiaca + "\n" +
                "Dieta Alimentar: " + dietaAlimentar + "\n" +
                "IMC: " + calcularIMC() + "\n" +
                "Atividades Físicas: " + atividadesFisicas.toString();
    }

    // Método para registrar atividades físicas
    public void registrarAtividadeFisica(String atividade) {
        atividadesFisicas.add(atividade);
    }
}
