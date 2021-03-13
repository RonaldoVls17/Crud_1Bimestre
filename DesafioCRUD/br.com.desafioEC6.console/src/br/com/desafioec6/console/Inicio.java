/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.desafioec6.console;

import br.com.desafioec6.business.Configuration;
import br.com.desafioec6.enums.TipoRepositorio;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Inicio {
    public static MaquinaEstadoConsole estadoConsole;
    
     public static void main(String[] args) {
        // TODO code application logic here
        Configuration.getInstance().setDatabase(TipoRepositorio.TEXTO);
        
        
        String repositorio = Configuration.getInstance().getTipoRepositorio().getDescricao();
        estadoConsole = EnumEstadoConsole.BEM_VINDO.getEstadoMaquina();
        System.out.println("Repositório configurado para " + repositorio);
        Boolean saida = false;
        while (!saida) {
            saida = estadoConsole.Executa();
        }

    }
}
