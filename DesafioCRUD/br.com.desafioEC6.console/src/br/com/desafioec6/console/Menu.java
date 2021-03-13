/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.desafioec6.console;

import br.com.desafioec6.business.Configuration;
import br.com.desafioec6.comum.Produto;
import br.com.desafioec6.enums.TipoRepositorio;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public enum Menu {

    CRUD(new CRUDStatus()),
    List(new EstadoLista()),
    Menu(new EstadoConsoleMenuPrincipal());

    MaquinaEstadoConsole state;

    Menu(MaquinaEstadoConsole estado){
        this.state = estado;
    }

    public MaquinaEstadoConsole getMenu(){
        return state;
    }
}
