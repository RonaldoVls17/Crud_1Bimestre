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
public enum Cor {
    AZUL(0), VERDE(1), AMARELO(2), VERMELHO(3), ROSA(4), ROXO(5), PRETO(6),
    BRANCO(7), CINZA(8), LARANJA(9), MARROM(10);

    int idCor;

    Cor(int idCor) {
        this.idCor = idCor;
    }

    /**
     *
     * @param id of the product Color, recorded in the repository
     * @return the color name referring to the id
     */
    public static Cor CasoCor(int id){
        Cor tom;
        switch (id) {
            case 0:
                tom = Cor.AZUL;
                break;
            case 1:
                tom = Cor.VERDE;
                break;
            case 2:
                tom = Cor.AMARELO;
                break;
            case 3:
                tom = Cor.VERMELHO;
                break;
            case 4:
                tom = Cor.ROSA;
                break;
            case 5:
                tom = Cor.ROXO;
                break;
            case 6:
                tom = Cor.PRETO;
                break;
            case 7:
                tom = Cor.BRANCO;
                break;
            case 8:
                tom = Cor.CINZA;
                break;
            case 9:
                tom = Cor.LARANJA;
                break;
            case 10:
                tom = Cor.MARROM;
                break;
            default:
                tom = null;
        }
        return tom;
    }

    public int getCor() {
        return idCor;
    }

}