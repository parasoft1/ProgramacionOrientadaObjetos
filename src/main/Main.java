package main;

import static entidades.Mensajes.*;
import entidades.empleados.Salario;

import javax.swing.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Main {

    public static void main(String[] args){

        DecimalFormatSymbols simbolo=new DecimalFormatSymbols();

        simbolo.setDecimalSeparator(',');
        simbolo.setGroupingSeparator('.');

        DecimalFormat formateador=new DecimalFormat("###,###.##");
        Salario salario = new Salario();

        String horas= JOptionPane.showInputDialog(null, MENSAJE_PETICION_HORAS.getMensajes());
        String valor= JOptionPane.showInputDialog(null, MENSAJE_PETICION_VALOR_HORA.getMensajes());


        salario.setHorasTrabajadas(Double.parseDouble(horas));
        salario.setValorHora(Double.parseDouble(valor));

        JOptionPane.showInputDialog(null,MENSAJE_SALARIO_PAGAR,formateador.format(salario.calcularSalario()));

        System.out.println(salario.toString());
    }


}
