/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.desafioec6.console;

/**
 *
 * @author Pc
 */
public enum EnumEstadoConsole {
    
    BEM_VINDO(new EstadoConsoleBemVindo()),
    
    MENU_PRINCIPAL (new EstadoConsoleMenuPrincipal()),
    
    MENU_CRUD (new CRUDStatus()),
    
    EXIBIR_BOA_NOITE (new EstadoConsoleExibirBoaNoite());
 
    private final MaquinaEstadoConsole estadoMaquina;
    
    EnumEstadoConsole(MaquinaEstadoConsole estadoMaquina) {
        this.estadoMaquina = estadoMaquina;
    }
 
    public MaquinaEstadoConsole getEstadoMaquina() {
        return estadoMaquina;
    }
}
