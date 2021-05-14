/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.sensoriamentoremoto.Model;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author tarci
 */
public class Download {

    public static ImageIcon fromUrl(String url, int width, int heigth) throws IOException{
        try {
            URL imageUrl = new URL(url);
            InputStream in = imageUrl.openStream();
            BufferedImage image = ImageIO.read(in);
            in.close();
            return new ImageIcon(image.getScaledInstance(heigth, width, Image.SCALE_SMOOTH));
        } catch (IOException ioe) {
            throw new IOException("Verifique a conexão com a internet");
        }
    }
}
