/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.desafioec6.console;

import br.com.desafioec6.comum.Produto;
import br.com.desafioec6.dao.RepositoryTxtDAO;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class EstadoLista extends MaquinaEstadoConsole {

    @Override
    public boolean Executa(){

        if(RepositoryTxtDAO.produtos.size()!=0)
            System.out.println("Aqui estÃ£o todos os produtos cadastrados:\n\n");
        else
            System.out.println("NÃ£o existem produtos cadastrados :/");

        for (Produto p:
        RepositoryTxtDAO.produtos) {

            System.out.println("ID: " + p.getId());
            System.out.println("Data de Entrada: " + p.getData());
            System.out.println("Local da Compra: " + p.getLocalCompra());
            System.out.println("Tipo: " + p.getTipo());
            System.out.println("Marca: " + p.getMarca());
            System.out.println("Caracteristicas: " + p.getDescricao());
            System.out.println("Tamanho: " + p.getTamanho());
            System.out.println("Cor: " + p.getCor());
            System.out.println("Valor de Etiqueta na compra: " + p.getValorEtiqueta());
            System.out.println("Valor pago na compra: " + p.getValorCompra());
            System.out.println("Valor para margem de 100%: " + p.getValorBase());
            System.out.println("Preco sugerido: " + p.getPreco());

            System.out.println("\n\n");
        }

        System.out.println("Digite:\n1 - Retornar ao menu\n2 - Retornar ao estoque");

        String opcao = "";
        Scanner input = new Scanner(System.in);
        opcao = input.next();

        if(opcao.equals("2"))
            Inicio.estadoConsole = Menu.CRUD.getMenu();
        else
            Inicio.estadoConsole = Menu.Menu.getMenu();
        return false;
    }

   
}
