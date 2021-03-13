/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.desafioec6.comum;

/**
 *
 * @author Pc
 */
public enum Repository {
    SQL(0), MySQL(1), Oracle(2), PostgreSQL(3), Access(4),
    FileExcel(5), FileTXT(6);

    int idRepository;

    Repository(int idRepository) {
        this.idRepository = idRepository;
    }
}
