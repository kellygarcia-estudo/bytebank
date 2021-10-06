package br.com.alura.bytebank;

import br.com.alura.bytebank.model.Funcionario;

import java.time.LocalDate;

public class Principal {

    public static void main(String[] args) {
        System.out.println("bem vindo ao byte bank");
        Funcionario jose = new Funcionario("José",1, LocalDate.of(1999, 2, 10));
        Funcionario maria = new Funcionario("Maria",2, LocalDate.of(1992, 4, 19));
        System.out.println(jose);
        System.out.println(maria);
    }


}
