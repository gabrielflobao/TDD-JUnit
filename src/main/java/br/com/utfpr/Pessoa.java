package br.com.utfpr;
/**
 * Author: Gabriel F F Lobão
 */
public class Pessoa {
    private String nome;
    private Genero genero;
    private int idade;

    private Double salario;


    public Pessoa(String nome,Genero genero, int idade,Double salario) {
        this.nome = nome;
        this.genero = genero;
        verificaIdade(idade);
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        verificaIdade(idade);
    }

    public void verificaIdade(int idade) {
        if(idade <0) {
            throw new RuntimeException("Idade Inválida");
        } else {
            this.idade = idade;
        }
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
