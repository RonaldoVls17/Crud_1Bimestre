/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.desafioec6.console;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class EstadoConsoleMenuPrincipal extends MaquinaEstadoConsole{

    @Override
    public boolean Executa() {
        System.out.println("*** Menu Principal");
        Scanner scan = new Scanner(System.in);
        System.out.println("0 - Sair");
        System.out.println("1 - Menu Crud");
        int opcao = scan.nextInt();
        switch (opcao)
        {
            case 0:
                
                break;
            case 1:
                Inicio.estadoConsole = EnumEstadoConsole.MENU_CRUD.getEstadoMaquina();
                break;
      
        }
        return false;
    }
    
}

