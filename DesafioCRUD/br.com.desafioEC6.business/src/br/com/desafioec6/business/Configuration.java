/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.desafioec6.business;

import br.com.desafioec6.enums.TipoRepositorio;

/**
 *
 * @author Pc
 */
public class Configuration {
      private static Configuration uniqueInstance;
 
    // Isso é um Singleton - Somente utilize o método getInstance para 
    // acessar o objeto! => Construtor privado
    private Configuration() {
    }
 
    public static synchronized Configuration getInstance() {
        if (uniqueInstance == null)
            uniqueInstance = new Configuration();
 
        return uniqueInstance;
    }
    
    private TipoRepositorio tipoRepositorio; 

    public TipoRepositorio getTipoRepositorio() {
        return tipoRepositorio;
    }

    
    public void setDatabase(TipoRepositorio tipoRepositorio) {
        this.tipoRepositorio = tipoRepositorio;
    }
}
