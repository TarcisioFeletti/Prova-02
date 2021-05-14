/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.sensoriamentoremoto.Model;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author tarci
 */
public class CacheModel {
    private static CacheModel instancia;
    private ArrayList<ImagemRealModel> cacheImagem;
    
    private CacheModel(){
        cacheImagem = new ArrayList();
    }
    
    public static CacheModel getInstancia(){
        if(instancia == null){
            instancia = new CacheModel();
        }
        return instancia;
    }

    public ImagemRealModel getImagem(String nome, String url) throws IOException {
        int i = 0;
        for (ImagemRealModel imagemReal : cacheImagem) {
            if (imagemReal.getNomeImagem().equals(nome)) {
                return imagemReal;
            }
            i++;
        }
        if (i <= cacheImagem.size()) {
            cacheImagem.add(new ImagemRealModel(nome, url));
            return cacheImagem.get(cacheImagem.size() - 1);
        }
        return null;
    }
}
