/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.sensoriamentoremoto.Model;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author tarci
 */
public class ProxyImagemModel implements IProxyImagemModel {

    private static ProxyImagemModel instancia;
    private String nomeImagem;
    private ArrayList<ImagemRealModel> cacheImagem;

    private ProxyImagemModel() {
        this.cacheImagem = new ArrayList();
    }

    public static ProxyImagemModel getInstancia() {
        if (instancia == null) {
            instancia = new ProxyImagemModel();
        }
        return instancia;
    }

    @Override
    public void carregarImagem(String nome) {
        cacheImagem.add(new ImagemRealModel(nome));
    }

    @Override
    public ImageIcon display() {
        for (ImagemRealModel imagem : cacheImagem) {
            if (imagem.getNomeImagem().equals(this.nomeImagem)) {
                System.out.println("Exibindo Imagem");
                return imagem.display();
            }
        }
        carregarImagem(this.nomeImagem);
        System.out.println("Carregando Imagem");
        System.out.println("Exibindo Imagem");
        return cacheImagem.get(cacheImagem.size()-1).display();
    }

    public void setNomeImagem(String nomeImagem) {
        this.nomeImagem = nomeImagem;
    }

}
