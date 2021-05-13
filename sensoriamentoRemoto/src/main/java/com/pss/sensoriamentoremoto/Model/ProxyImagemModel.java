/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.sensoriamentoremoto.Model;

import javax.swing.ImageIcon;

/**
 *
 * @author tarci
 */
public class ProxyImagemModel implements IProxyImagemModel {

    private String nomeImagem;
    private String url;
    private ImagemRealModel imagem;

    public ProxyImagemModel(String nome, String url) {
        this.nomeImagem = nome;
        this.url = url;
    }

    @Override
    public ImageIcon display() {
        imagem = CacheModel.getInstancia().getImagem(nomeImagem, url);
        return imagem.display();
    }

    public String getNomeImagem() {
        return nomeImagem;
    }
    
    

}
