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
public interface IProxyImagemModel {
    public ImageIcon display() throws IOException;
}
