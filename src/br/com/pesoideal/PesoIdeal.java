package br.com.pesoideal;

public class PesoIdeal {

    public String calcularPesoIdeal(double altura, double peso) {
        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25) {
            return "Peso ideal";
        } else {
            return "Acima do peso";
        }
    }
}
