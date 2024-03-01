package br.com.utfpr;

import java.beans.Expression;
/**
 * Author: Gabriel F F Lobão
 */
public class CalculaHipotecaImpl implements CalculaHipoteca{
    /**
     * Jovem Masc -> 18-35 / Fator -> 75
     * Médio Masc -> 36-45 / Fator -> 55
     * Idoso Masc -> 46-55 / Fator -> 30
     * ----------------------------------
     * Jovem FEM -> 18-30 / Fator -> 70
     * Médio FEM -> 31-40 / Fator -> 50
     * Idoso FEM -> 41-50 / Fator -> 35
     */

    private final int FATOR_JOVEM_MASC = 75;
    private final int FATOR_JOVEM_FEM = 70;
    private final int FATOR_MEDIO_MASC = 55;
    private final int FATOR_MEDIO_FEM = 50;
    private final int FATOR_IDOSO_MASC = 30;
    private final int FATOR_IDOSO_FEM = 35;


    @Override
    public Double calculaMascuJovem(int idade, Double salario) {
        return idade >= 18 && idade <=35 ? salario * FATOR_JOVEM_MASC : -1;
    }

    @Override
    public Double calculaFemJovem(int idade, Double salario) {
        return idade >= 18 && idade <=30 ? salario * FATOR_JOVEM_FEM : -1;
    }

    @Override
    public Double calculaMascuMedio(int idade, Double salario) {
        return idade >= 36 && idade <=45 ? salario * FATOR_MEDIO_MASC : -1;
    }

    @Override
    public Double calculaFemMedio(int idade, Double salario) {
        return idade >= 31 && idade <=40 ? salario * FATOR_MEDIO_FEM : -1;
    }

    @Override
    public Double calculaMascuIdoso(int idade, Double salario) {
        return idade >= 46 && idade <=56 ? salario * FATOR_IDOSO_MASC : -1;
    }

    @Override
    public Double calculaFemIdoso(int idade, Double salario) {
        return idade >= 41 && idade <=50 ? salario * FATOR_IDOSO_FEM : -1;
    }
}
