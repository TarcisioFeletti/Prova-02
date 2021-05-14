/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.sensoriamentoremoto.Model;

import java.io.IOException;
import javax.swing.ImageIcon;

/**
 *
 * @author tarci
 */
public class ImagemRealModel implements IProxyImagemModel {

    private String nomeImagem;
    private String url;
    private ImageIcon imagem;

    public ImagemRealModel(String nomeImagem, String url) throws IOException {
        this.nomeImagem = nomeImagem;
        this.url = url;
        carregarImagem(url);
    }

    public void carregarImagem(String url) throws IOException{
        imagem = Download.fromUrl(url, 670, 930);
    }

    @Override
    public ImageIcon display() {
        return imagem;
    }

    public String getNomeImagem() {
        return nomeImagem;
    }

}
