/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.sensoriamentoremoto.Presenter;

import com.pss.sensoriamentoremoto.View.PrincipalView;

/**
 *
 * @author tarci
 */
public class MainPresenter {
    public static void main(String[] args) {
        PrincipalView tela = new PrincipalView();
        tela.setLocationRelativeTo(tela.getParent());
        tela.setVisible(true);
    }
}
