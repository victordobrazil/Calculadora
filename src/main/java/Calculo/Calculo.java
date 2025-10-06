/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculo;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author victor.haalves2
 */
public class Calculo {

    private Double peso;
    private Double altura;
    private Double IMC;
    private String Situacao;

    public Calculo(Double altura, Double peso) {
        this.peso = peso;
        this.altura = altura;
        calculaIMC();
        definiSituacao();

    }

    private void calculaIMC() {
        this.setIMC(peso / (altura * altura));

    }

    private void definiSituacao() {
        if (getIMC() <= 17) {
            setSituacao("Muito abaixo do peso");
        } else if (getIMC() >= 18 && getIMC() <= 18.49) {
            setSituacao("Abaixo do peso");
        } else if (getIMC() >= 18.5 && getIMC() <= 24.99) {
            setSituacao("Peso normal");
        } else if (getIMC() >= 25 && getIMC() <= 29.99) {
            setSituacao("Acima do peso");
        } else if (getIMC() >= 30 && getIMC() <= 34.99) {
            setSituacao("Obesidade 1");
        } else if (getIMC() >= 35 && getIMC() <= 39.99) {
            setSituacao("Obesidade 2");
        } else if (getIMC() >= 40) {
            setSituacao("Obesidade 3");
        }
        System.out.println(IMC);

    }

    /**
     * @return the peso
     */
    public Double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(Double peso) {
        this.peso = peso;
    }

    /**
     * @return the altura
     */
    public Double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(Double altura) {
        this.altura = altura;
    }

    /**
     * @return the IMC
     */
    public Double getIMC() {
        return IMC;
    }

    /**
     * @param IMC the IMC to set
     */
    public void setIMC(Double IMC) {
        this.IMC = IMC;
    }

    /**
     * @return the Situacao
     */
    public String getSituacao() {
        return Situacao;
    }

    /**
     * @param Situacao the Situacao to set
     */
    public void setSituacao(String Situacao) {
        this.Situacao = Situacao;
    }

}
