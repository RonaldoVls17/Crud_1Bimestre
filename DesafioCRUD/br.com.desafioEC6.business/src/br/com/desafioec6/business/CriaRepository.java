/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.desafioec6.business;

import br.com.desafioec6.dao.DAO;
import br.com.desafioec6.dao.RepositoryTxtDAO;
import br.com.desafioec6.enums.TipoRepositorio;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class CriaRepository {
    
      public static DAO Fabrica() throws KrbException {
        if (Config.getInstance().getTipoRepositorio()== TipoRepositorio.TEXTO)
            return new RepositoryTxtDAO();
        else
            return null ;
    }
}
