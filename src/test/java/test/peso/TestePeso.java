package br.com.pesoideal;
import br.com.pesoideal.PesoIdeal;


import org.junit.jupiter.api.Test;
import br.com.pesoideal.PesoIdeal;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestePeso {

    // Testa o peso ideal
    @Test
    public void TestePesoIdeal() {
        PesoIdeal pesoIdeal = new PesoIdeal();
        String resultado = pesoIdeal.calcularPesoIdeal(1.70, 60);
        assertEquals("Peso ideal", resultado);
    }

    // Testa o caso abaixo do peso
    @Test
    public void testeAbaixoDoPeso() {
        PesoIdeal pesoIdeal = new PesoIdeal();
        String resultado = pesoIdeal.calcularPesoIdeal(1.70, 40);
        assertEquals("Abaixo do peso", resultado);
    }

    // Testa o caso acima do peso
    @Test
    public void testeAcimaDoPeso() {
        PesoIdeal pesoIdeal = new PesoIdeal();
        String resultado = pesoIdeal.calcularPesoIdeal(1.70, 80);
        assertEquals("Acima do peso", resultado);
    }

    // Testa outro caso de peso ideal
    @Test
    public void testePesoIdealOutro() {
        PesoIdeal pesoIdeal = new PesoIdeal();
        String resultado = pesoIdeal.calcularPesoIdeal(1.80, 75);
        assertEquals("Peso ideal", resultado);
    }
}
