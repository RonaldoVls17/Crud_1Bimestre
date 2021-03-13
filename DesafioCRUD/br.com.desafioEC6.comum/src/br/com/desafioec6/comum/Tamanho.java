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
public enum Tamanho {
 P(0), M(1), G(2), GG(3);

    int idTamanho;

    Tamanho(int idTamanho) {
        this.idTamanho = idTamanho;
    }

    /**
     *
     * @param id of the product Size, recorded in the repository
     * @return the size referring to the id
     */
    public static Tamanho CaseTamanho(int id){
        Tamanho tamanho;
        switch (id) {
            case 0:
                tamanho = Tamanho.P;
                break;
            case 1:
                tamanho = Tamanho.M;
                break;
            case 2:
                tamanho = Tamanho.G;
                break;
            case 3:
                tamanho = Tamanho.GG;
                break;
            default:
                tamanho = null;
        }
        return tamanho;
    }

    public int getTamanho() {
        return idTamanho;
    }
}
