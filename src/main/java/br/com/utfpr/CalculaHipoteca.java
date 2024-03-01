package br.com.utfpr;
/**
 * Author: Gabriel F F Lobão
 */
public interface CalculaHipoteca {

    Double calculaMascuJovem(int idade,Double salario);
    Double calculaFemJovem(int idade,Double salario);
    Double calculaMascuMedio(int idade,Double salario);
    Double calculaFemMedio(int idade,Double salario);
    Double calculaMascuIdoso(int idade,Double salario);
    Double calculaFemIdoso(int idade,Double salario);


}
