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

    public static ImageIcon fromUrl(String url, int width, int heigth) {
        try {
            URL imageUrl = new URL(url);
            InputStream in = imageUrl.openStream();
            BufferedImage image = ImageIO.read(in);
            in.close();
            ImageIcon imageIcon = new ImageIcon(image.getScaledInstance(width, heigth, Image.SCALE_DEFAULT));
            return imageIcon;
        } catch (IOException ioe) {
            //log the error
        }
        return null;
    }
}
