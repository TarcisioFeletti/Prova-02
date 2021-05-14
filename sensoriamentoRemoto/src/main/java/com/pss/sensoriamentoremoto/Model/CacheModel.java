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

    private ArrayList<ProxyImagemModel> cacheImagem;
    
    public CacheModel(){
        cacheImagem = new ArrayList();
        cacheImagem.add(new ProxyImagemModel("Africa", "https://gitlab.com/TarcisioFeletti/imagens-prova02-pss/-/raw/master/africa1920.jpg"));
        cacheImagem.add(new ProxyImagemModel("Australia", "https://gitlab.com/TarcisioFeletti/imagens-prova02-pss/-/raw/master/australia1920.jpg"));
        cacheImagem.add(new ProxyImagemModel("Europa", "https://gitlab.com/TarcisioFeletti/imagens-prova02-pss/-/raw/master/europe1920.jpg"));
        cacheImagem.add(new ProxyImagemModel("Egito", "https://gitlab.com/TarcisioFeletti/imagens-prova02-pss/-/raw/master/map1920.jpg"));
        cacheImagem.add(new ProxyImagemModel("EUA", "https://gitlab.com/TarcisioFeletti/imagens-prova02-pss/-/raw/master/unitedstates1920.jpg"));
    }

    public ProxyImagemModel getProxy(String nome) throws IOException {
        for (ProxyImagemModel proxy : cacheImagem) {
            if (proxy.getNomeImagem().equalsIgnoreCase(nome)) {
                return proxy;
            }
        }
        return null;
    }
}
