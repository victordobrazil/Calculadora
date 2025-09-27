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

    

        public static void main(String[] args) {
                    
            double media;
            double Peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso"));
            double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura"));
            media =  Peso / (altura * altura);
            System.out.println(media);
            
            if(media <= 17 ){
                JOptionPane.showInternalMessageDialog(null, "Muito abaixo do peso");
                }else if(media >= 18 && media <= 18.49){
            JOptionPane.showInternalMessageDialog(null, "teste");
        }

        }          
}
