package br.com.utfpr;

/**
 * Author: Gabriel F F Lobão
 */
public class CalculadoraHipoteca {

    CalculaHipoteca calculaHipoteca = new CalculaHipotecaImpl();

    public Double calculaHipoteca(Pessoa pessoa) {
        if(pessoa.getGenero() !=null) {
            if (pessoa.getGenero().equals(Genero.FEMININO)) {
                if (calculaHipoteca.calculaFemJovem(pessoa.getIdade(), pessoa.getSalario()) != -1) {
                    return calculaHipoteca.calculaFemJovem(pessoa.getIdade(), pessoa.getSalario());
                } else if (calculaHipoteca.calculaFemMedio(pessoa.getIdade(), pessoa.getSalario()) != -1) {
                    return calculaHipoteca.calculaFemMedio(pessoa.getIdade(), pessoa.getSalario());
                } else if (calculaHipoteca.calculaFemIdoso(pessoa.getIdade(), pessoa.getSalario()) != -1) {
                    return calculaHipoteca.calculaFemIdoso(pessoa.getIdade(), pessoa.getSalario());
                } else {
                    throw new RuntimeException("Erro Clausula Mulher");
                }

            } else if (pessoa.getGenero().equals(Genero.MASCULINO)) {
                if (calculaHipoteca.calculaMascuJovem(pessoa.getIdade(), pessoa.getSalario()) != -1) {
                    return calculaHipoteca.calculaMascuJovem(pessoa.getIdade(), pessoa.getSalario());
                } else if (calculaHipoteca.calculaMascuMedio(pessoa.getIdade(), pessoa.getSalario()) != -1) {
                    return calculaHipoteca.calculaMascuMedio(pessoa.getIdade(), pessoa.getSalario());
                } else if (calculaHipoteca.calculaMascuIdoso(pessoa.getIdade(), pessoa.getSalario()) != -1) {
                    return calculaHipoteca.calculaMascuIdoso(pessoa.getIdade(), pessoa.getSalario());
                } else {
                    throw new RuntimeException("Erro Clausula Homem");
                }

            }
        }
        throw new RuntimeException("Genero não existe ou não informado");
    }
}
