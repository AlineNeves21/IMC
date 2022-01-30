package com.example.imc;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IMC {

    private double peso, altura;
    private boolean sexo;

    public IMC (double peso, double altura, boolean sexo) {
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public  String calcularIMC() {
        double imc = (peso / (altura * altura));
        if (sexo) {//masculino
            if (imc < 20.7)
                return "Abaixo do peso";
            else if (imc < 26.4) //5
                return "No peso normal";
            else if (imc < 31.1)
                return "Acima do peso";
            else
                return "Obeso";

        } else {//feminino
            if (imc < 19.1)
                return "Abaixo do peso";
            else if (imc < 25.8)
                return "No peso normal";
            else if (imc < 32.3)
                return "Acima do peso";
            else
                return "Obeso";
        }
    }
}