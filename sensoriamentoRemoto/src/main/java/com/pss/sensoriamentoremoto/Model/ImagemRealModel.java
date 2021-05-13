/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.sensoriamentoremoto.Model;

import com.pss.sensoriamentoremoto.Model.IProxyImagemModel;
import javax.swing.ImageIcon;

/**
 *
 * @author tarci
 */
public class ImagemRealModel implements IProxyImagemModel{
    private String nomeImagem;
    private ImageIcon imagem;
    
    public ImagemRealModel(String nomeImagem){
        this.nomeImagem = nomeImagem;
        carregarImagem(nomeImagem);
    }
    
    @Override
    public void carregarImagem(String url) {
        imagem = new ImageIcon(new ImageIcon("C:\\Users\\tarci\\OneDrive\\Documentos\\Estudos\\2020 2\\PSS\\"
                + "Prova02\\prova02\\sensoriamentoRemoto\\src\\main\\java\\com\\pss\\sensoriamentoremoto\\Imagens\\"
                + url).
                getImage().getScaledInstance(880, 620, 0));
    }

    @Override
    public ImageIcon display() {
        return imagem;
    }

    public String getNomeImagem() {
        return nomeImagem;
    }
    
}
