/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.desafioec6.comum;

import java.util.Date;

/**
 *
 * @author Pc
 */
public class Produto {
    
    protected int id;
    protected Date data;
    protected String localCompra;
    protected String tipo;
    protected String marca;
    protected String descricao;
    protected Tamanho tamanho;
    protected Cor cor;
    protected float valorEtiqueta;
    protected float valorCompra;
    protected float preco;

    public Produto(int id, String localCompra, String tipo, String marca, String descricao, Tamanho tamanho,
                   Cor cor, float valorEtiqueta, float valorCompra, float preco) {
        this.id = id;
        this.localCompra = localCompra;
        this.tipo = tipo;
        this.marca = marca;
        this.descricao = descricao;
        this.tamanho = tamanho;
        this.cor = cor;
        this.valorEtiqueta = valorEtiqueta;
        this.valorCompra = valorCompra;
        this.preco = preco;
    }

    public Produto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getLocalCompra() {
        return localCompra;
    }

    public void setLocalCompra(String localCompra) {
        this.localCompra = localCompra;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public float getValorEtiqueta() {
        return valorEtiqueta;
    }

    public void setValorEtiqueta(float valorEtiqueta) {
        this.valorEtiqueta = valorEtiqueta;
    }

    public float getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(float valorCompra) {
        this.valorCompra = valorCompra;
    }

    public float getValorBase() {
        return valorCompra*2;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
