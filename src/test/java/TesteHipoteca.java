import br.com.utfpr.CalculadoraHipoteca;
import br.com.utfpr.Genero;
import br.com.utfpr.Pessoa;
import org.junit.Assert;
import org.junit.Test;

/**
 * Author: Gabriel F F Lobão
 */
public class TesteHipoteca {
    /**
     * Jovem Masc -> 18-35 / Fator -> 75
     * Médio Masc -> 36-45 / Fator -> 55
     * Idoso Masc -> 46-55 / Fator -> 30
     * ----------------------------------
     * Jovem FEM -> 18-30 / Fator -> 70
     * Médio FEM -> 31-40 / Fator -> 50
     * Idoso FEM -> 41-50 / Fator -> 35
     */

    @Test
    public void testHipotecaJovemMascValido() {
        CalculadoraHipoteca calculadoraHipoteca = new CalculadoraHipoteca();

        Pessoa jovemMasc = new Pessoa("Gabriel", Genero.MASCULINO, 18, new Double(3000));
        Double hipotecaValor = calculadoraHipoteca.calculaHipoteca(jovemMasc);
        Assert.assertEquals(new Double(225000), hipotecaValor);

    }

    @Test
    public void testHipotecaJovemFemValido() {
        CalculadoraHipoteca calculadoraHipoteca = new CalculadoraHipoteca();
        Pessoa jovemMasc = new Pessoa("Mariana", Genero.FEMININO, 18, new Double(1500));
        Double hipotecaValor = calculadoraHipoteca.calculaHipoteca(jovemMasc);
        Assert.assertEquals(new Double(105000), hipotecaValor);

    }

    @Test
    public void testHipotecaMedioMascValido() {
        CalculadoraHipoteca calculadoraHipoteca = new CalculadoraHipoteca();
        Pessoa medioMasc = new Pessoa("Gabriel", Genero.MASCULINO, 36, new Double(1000));
        Double hipotecaValor = calculadoraHipoteca.calculaHipoteca(medioMasc);
        Assert.assertEquals(new Double(55000), hipotecaValor);

    }

    @Test
    public void testHipotecaMedioFemValido() {
        CalculadoraHipoteca calculadoraHipoteca = new CalculadoraHipoteca();
        Pessoa medioFem = new Pessoa("Mariana", Genero.FEMININO, 31, new Double(1000));
        Double hipotecaValor = calculadoraHipoteca.calculaHipoteca(medioFem);
        Assert.assertEquals(new Double(50000), hipotecaValor);

    }

    @Test
    public void testHipotecaIdosoMascValido() {
        CalculadoraHipoteca calculadoraHipoteca = new CalculadoraHipoteca();
        Pessoa idosoMasc = new Pessoa("Gabriel", Genero.MASCULINO, 46, new Double(1000));
        Double hipotecaValor = calculadoraHipoteca.calculaHipoteca(idosoMasc);
        Assert.assertEquals(new Double(30000), hipotecaValor);

    }

    @Test
    public void testHipotecaIdosoFemValido() {
        CalculadoraHipoteca calculadoraHipoteca = new CalculadoraHipoteca();
        Pessoa idosoFem = new Pessoa("Mariana", Genero.FEMININO, 41, new Double(1000));
        Double hipotecaValor = calculadoraHipoteca.calculaHipoteca(idosoFem);
        Assert.assertEquals(new Double(35000), hipotecaValor);

    }

    @Test
    public void testHipotecaJovemMascIdadeMenorInvalido() {
        CalculadoraHipoteca calculadoraHipoteca = new CalculadoraHipoteca();
        try {
            Pessoa jovemMasc = new Pessoa("Gabriel", Genero.MASCULINO, 17, new Double(3000));
            Double hipotecaValor = calculadoraHipoteca.calculaHipoteca(jovemMasc);
            Assert.fail();
        } catch (Exception e) {
            Assert.assertEquals("Erro Clausula Homem", e.getMessage());

        }

    }

    @Test
    public void testHipotecaJovemFemIdadeMenorInvalido() {
        CalculadoraHipoteca calculadoraHipoteca = new CalculadoraHipoteca();
        try {
            Pessoa jovemMasc = new Pessoa("Mariana", Genero.FEMININO, 17, new Double(3000));
            Double hipotecaValor = calculadoraHipoteca.calculaHipoteca(jovemMasc);
            Assert.fail();
        } catch (Exception e) {
            Assert.assertEquals("Erro Clausula Mulher", e.getMessage());

        }

    }

    @Test
    public void testHipotecaidosoIdadeMaiorrInvalido() {
        CalculadoraHipoteca calculadoraHipoteca = new CalculadoraHipoteca();
        try {
            Pessoa jovemMasc = new Pessoa("Gabriel", Genero.MASCULINO, 57, new Double(3000));
            Double hipotecaValor = calculadoraHipoteca.calculaHipoteca(jovemMasc);
            Assert.fail();
        } catch (Exception e) {
            Assert.assertEquals("Erro Clausula Homem", e.getMessage());

        }
    }

    @Test
    public void testHipotecaIdosaFemIdadeMaiorInvalido() {
        CalculadoraHipoteca calculadoraHipoteca = new CalculadoraHipoteca();
        try {
            Pessoa jovemMasc = new Pessoa("Mariana", Genero.FEMININO, 57, new Double(3000));
            Double hipotecaValor = calculadoraHipoteca.calculaHipoteca(jovemMasc);
            Assert.fail();
        } catch (Exception e) {
            Assert.assertEquals("Erro Clausula Mulher", e.getMessage());

        }

    }
    @Test
    public void testGeneroIncorreto() {
        CalculadoraHipoteca calculadoraHipoteca = new CalculadoraHipoteca();
        try {
            Pessoa generoIncorreto = new Pessoa("Mariana", null, 18, new Double(3000));
            Double hipotecaValor = calculadoraHipoteca.calculaHipoteca(generoIncorreto);
            Assert.fail();
        } catch (Exception e) {
            Assert.assertEquals("Genero não existe ou não informado", e.getMessage());

        }

    }

    @Test
    public void testGeneroNaoInformado() {
        CalculadoraHipoteca calculadoraHipoteca = new CalculadoraHipoteca();
        try {
            Pessoa generoIncorreto = new Pessoa("Mariana", Genero.NAO_INFORMADO, 18, new Double(3000));
            Double hipotecaValor = calculadoraHipoteca.calculaHipoteca(generoIncorreto);
            Assert.fail();
        } catch (Exception e) {
            Assert.assertEquals("Genero não existe ou não informado", e.getMessage());

        }

    }


}
