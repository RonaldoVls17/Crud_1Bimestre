/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.desafioec6.console;

import br.com.desafioec6.business.CriaRepository;
import br.com.desafioec6.comum.Cor;
import br.com.desafioec6.comum.Produto;
import br.com.desafioec6.comum.Tamanho;
import br.com.desafioec6.dao.DAO;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class CRUDStatus extends MaquinaEstadoConsole {

    public boolean Execute(){

        System.out.println("Selecione uma das opcoes abaixo:");
        System.out.println("C - Cadastrar novo produto\nR - Localizar produto\n"
                + "U - Atualizar produto\nD - Deletar produto\n0 - Para voltar");

        String opcao = "";
        Scanner input = new Scanner(System.in);
        opcao = input.next().toUpperCase();

        switch (opcao){
            case "C":
                try{
                    Create();
                }
                catch (Exception erro){
                    System.out.println("Create() invalido");
                }
                break;
            case "R":
                Read();
                break;
            case "U":
                try{
                    Update();
                }
                catch (Exception erro){
                    System.out.println("Update() invalido");
                }
                break;
            case "D":
                Delete();
                break;
            case "0":
                break;
            default:
                System.out.println("Selecione uma opcao valida");
        }

        return false;
    }


    private void Delete(){
        DAO dao = CriaRepository.Fabrica();

        if(DAO.produtos.size()==0){
            System.out.println("Nenhum produto cadastrado para deletar");
            return;
        }

        for (Produto p:
             DAO.produtos) {
            System.out.println("ID: " + p.getId()+ ", Descricao: " + p.getDescricao());
        }
        boolean valido = false;
        String opcao = "";

        while (!valido){
            System.out.println("Digite o cÃ³digo do produto a ser deletado:");

            Scanner input = new Scanner(System.in);
            opcao = input.next().toUpperCase();


            try {
                Integer.parseInt(opcao);

                while (!valido){
                    System.out.println("Confirmar Exclusao? S/N");
                    String confirm = input.next().toUpperCase();
                    if (confirm.equals("S")){
                        dao.delete(Integer.parseInt(opcao));
                        System.out.println("Deletado com sucesso");
                        valido = true;
                    }
                    else if(confirm.equals("N")){
                        valido = true;
                    }
                }
            }
            catch (Exception erro){
                System.out.println("Digite um ID valido");
            }


        }

    }

    private void Update() throws Exception{
        String opcao = "";
        Scanner input = new Scanner(System.in);
        int code;

        DAO dao = CriaRepository.Fabrica();

        if(DAO.produtos.size()==0){
            System.out.println("Nenhum produto cadastrado para atualizar");
            return;
        }

        System.out.println("Digite o cÃ³digo do produto a ser atualizado:");
        opcao = input.next();
        code = Integer.parseInt(opcao);

        Produto prodUpdated = CRmethod(code);



        Produto oldProd = dao.Ler(code);
        oldProd.setData(prodUpdated.getData());
        oldProd.setLocalCompra(prodUpdated.getLocalCompra());
        oldProd.setTipo(prodUpdated.getTipo());
        oldProd.setMarca(prodUpdated.getMarca());
        oldProd.setDescricao(prodUpdated.getDescricao());
        oldProd.setTamanho(prodUpdated.getTamanho());
        oldProd.setCor(prodUpdated.getCor());
        oldProd.setValorEtiqueta(prodUpdated.getValorEtiqueta());
        oldProd.setValorCompra(prodUpdated.getValorEtiqueta());
        oldProd.setPreco(prodUpdated.getPreco());

        dao.atualizar(oldProd);
    }

    private void Create() throws Exception{

        String opcao = "";
        Scanner input = new Scanner(System.in);
        int code;

        System.out.println("Digite o ID do novo produto:");
        opcao = input.next();
        
        code = Integer.parseInt(opcao);

        Produto p = CRmethod(code);
        p.setId(code);

        DAO dao = CriaRepository.Fabrica();

        dao.criar(p);
    }

   private void Read(){

        DAO dao = CriaRepository.Fabrica();

        if(DAO.produtos.size()==0){
            System.out.println("Nenhum produto cadastrado para ser visualizado");
            return;
        }

        String opcao;
        Scanner input = new Scanner(System.in);
        int code;

        System.out.println("Digite o cÃ³digo do produto a ser visualizado:");
        opcao = input.next();
       
        code = Integer.parseInt(opcao);

        Produto p = dao.Ler(code);

        System.out.println("ID: " + p.getId());
        System.out.println("Data de Entrada: " + p.getData());
        System.out.println("Local da Compra: " + p.getLocalCompra());
        System.out.println("Tipo: " + p.getTipo());
        System.out.println("Marca: " + p.getMarca());
        System.out.println("Descricao: " + p.getDescricao());
        System.out.println("Tamanho: " + p.getTamanho());
        System.out.println("Cor: " + p.getCor());
        System.out.println("Valor de Etiqueta na compra: " + p.getValorEtiqueta());
        System.out.println("Valor pago na compra: " + p.getValorCompra());
        System.out.println("Valor para margem de 100%: " + p.getValorBase());
        System.out.println("Pressão sugerido: " + p.getPreco());

        System.out.println("\n\n");
    }
   
      private Produto CRmethod(int id) throws Exception{
        String opcao = "";
        Scanner input = new Scanner(System.in);

        Date date;
        String local;
        String type;
        String brand;
        String description;
        Tamanho tamanho;
        Cor cor;
        float valueTag;
        float valuePaid;
        float price;

        System.out.println("Digite a data (dd/MM/yyyy):");

        opcao = input.next();
     
        System.out.println("Digite o local da compra:");

        opcao = input.next();
       
        local = opcao;

        System.out.println("Digite o tipo do produto:");

        opcao = input.next();
      
        type = opcao;


        System.out.println("Digite a marca do produto:");

        opcao = input.next();
       
        brand = opcao;


        System.out.println("Digite as caracterÃ­sticas do produto:");

        opcao = input.next();
     
        description = opcao;

        System.out.println("Selecione o tamanho do produto:");
        System.out.println("0 - P\n1 - M\n2 - G\n3 - GG");

        opcao = input.next();
       
        tamanho = Tamanho.CaseTamanho(Integer.parseInt(opcao));


        System.out.println("Selecione a cor do produto:");
        System.out.println("0 - Azul\n1 - Verde\n2 - Amarelo\n3 - Vermelho\n4 - Rosa\n5 - Roxo\n" +
                "6 - Preto\n7 - Branco\n8 - Cinza\n9 - Laranja\n10 - Marrom");

        opcao = input.next();
        
        cor = Cor.CasoCor(Integer.parseInt(opcao));


        System.out.println("Digite o valor de etiqueta na compra:");

        opcao = input.next();
        
        valueTag = Float.parseFloat(opcao);


        System.out.println("Digite o valor pago na compra:");

        opcao = input.next();
       
        valuePaid = Float.parseFloat(opcao);


        System.out.println("Digite o preço sugerido:");

        opcao = input.next();
       
        price = Float.parseFloat(opcao);

        return new Produto(-1, local, type, brand, description,
                tamanho, cor, valueTag, valuePaid, price);
    }

    @Override
    public boolean Executa() {
        System.out.println("Selecione uma das opcoes abaixo:");
        System.out.println("C - Cadastrar novo produto\nR - Localizar produto\n"
                + "U - Atualizar produto\nD - Deletar produto\n0 - Para voltar");

        String opcao = "";
        Scanner input = new Scanner(System.in);
        opcao = input.next().toUpperCase();

        switch (opcao){
            case "C":
                try{
                    Create();
                }
                catch (Exception erro){
                    System.out.println("Create() invalido");
                }
                break;
            case "R":
                Read();
                break;
            case "U":
                try{
                    Update();
                }
                catch (Exception erro){
                    System.out.println("Update() invalido");
                }
                break;
            case "D":
                Delete();
                break;
            case "0":
                break;
            default:
                System.out.println("Selecione uma opcao valida");
        }

        return false;
    
    }

}
