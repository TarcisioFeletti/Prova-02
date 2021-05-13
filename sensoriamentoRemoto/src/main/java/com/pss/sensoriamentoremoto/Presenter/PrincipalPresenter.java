/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.sensoriamentoremoto.Presenter;

import com.pss.sensoriamentoremoto.Model.Download;
import com.pss.sensoriamentoremoto.Model.ProxyImagemModel;
import com.pss.sensoriamentoremoto.View.PrincipalView;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.plaf.metal.MetalBorders;

/**
 *
 * @author tarci
 */
public final class PrincipalPresenter {

    private PrincipalView tela;

    public PrincipalPresenter() {
        //url australia: https://pixabay.com/get/gb99e2cc0ed0d6d02ea7ebed2891e34cff43b8dbae3d9853630224ba70b998a5ba9eadd1bd0cfd8dcc1799af35a3994e3_1920.jpg
        //url africa: https://pixabay.com/get/g0cb6fb008e2e63917a381fc2ed70dbd2b8ee9ce4381e1f124329334cc8033da4eac8acddc5a8ae7454fdfab1263e8bea_1920.jpg
        //url egito: https://pixabay.com/get/g63bd1674ad96faff85c62692db6dcca3b18949cb979b641472724d6534b4aa6b137ec0efd18a626494770f69b00fff67_1920.jpg
        //url EUA noite: https://pixabay.com/get/g0d2dc18a11ccaed41eee8c4b6529013946fb82a98794a787e0185426ca1c2ca1ad6786631757c047894f668bc40a9b10_1920.jpg
        //url europa: https://pixabay.com/get/gba9fcf8c626dbc489d27b155cb71dd3979f924a7bafcbbabfbdb11ea3ace247f803f76ceca2c091bee730c0a77974e8f_1920.jpg
        //url 
        tela = new PrincipalView();
        tela.setLocationRelativeTo(tela.getParent());
        tela.setExtendedState(PrincipalView.MAXIMIZED_BOTH);
        tela.setVisible(true);
        tela.getLblMiniatura1().setIcon(Download.fromUrl("https://pixabay.com/get/g68682c35df99700a46aa6cdbc1b03f1c43e3197d9d407e2aeacdb1570e60e7941ec1418adae279d1ba0caf9b3aebf504_640.jpg", 100, 100));
        tela.getLblMiniatura2().setIcon(Download.fromUrl("https://pixabay.com/get/g9a66281ef43ca69a8600e2925d6ba798fde82b3c6134dab19fb91cd2d13dbafe8d038ccd2df2420a27eea16a4b2127be_640.jpg", 100, 100));
        tela.getLblMiniatura3().setIcon(Download.fromUrl("https://pixabay.com/get/gb0acee6407ea2aa54e5eda6e4079a44182e047861f46a038f7ecb288074bb239959fdab452e3c4e669cec71b2ff52d41_640.jpg", 100, 100));
        tela.getLblMiniatura4().setIcon(Download.fromUrl("https://pixabay.com/get/ge6dac93664624170c7d97d070fd3efaee599f9127d2e11e8a281f53877e02715b09151256bd9d6b43c8b81071df08a1f_640.jpg", 100, 100));
        tela.getLblMiniatura5().setIcon(Download.fromUrl("https://pixabay.com/get/gf283032a70662d6c359cbdab33d845eda43c1e360dbb7ebdd0d84d92f846b23d70dc865599c8ee16296be49965fac0dd_640.jpg", 100, 100));
        iniciarListeners(tela);
    }

    public void iniciarListeners(PrincipalView tela) {
        tela.getLblMiniatura1().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                tela.getLblImagem().setIcon(new ProxyImagemModel("Africa","https://pixabay.com/get/g0cb6fb008e2e63917a381fc2ed70dbd2b8ee9ce4381e1f124329334cc8033da4eac8acddc5a8ae7454fdfab1263e8bea_1920.jpg").display());   
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                tela.getLblMiniatura1().setBorder(new MetalBorders.OptionDialogBorder());
            }

            @Override
            public void mouseExited(MouseEvent e) {
                tela.getLblMiniatura1().setBorder(null);
            }
        });
        tela.getLblMiniatura2().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                tela.getLblImagem().setIcon(new ProxyImagemModel("Australia", "https://pixabay.com/get/gb99e2cc0ed0d6d02ea7ebed2891e34cff43b8dbae3d9853630224ba70b998a5ba9eadd1bd0cfd8dcc1799af35a3994e3_1920.jpg").display());
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                tela.getLblMiniatura2().setBorder(new MetalBorders.OptionDialogBorder());
            }

            @Override
            public void mouseExited(MouseEvent e) {
                tela.getLblMiniatura2().setBorder(null);
            }
        });
        tela.getLblMiniatura3().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                tela.getLblImagem().setIcon(new ProxyImagemModel("Egito","https://pixabay.com/get/g63bd1674ad96faff85c62692db6dcca3b18949cb979b641472724d6534b4aa6b137ec0efd18a626494770f69b00fff67_1920.jpg").display());
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                tela.getLblMiniatura3().setBorder(new MetalBorders.OptionDialogBorder());
            }

            @Override
            public void mouseExited(MouseEvent e) {
                tela.getLblMiniatura3().setBorder(null);
            }
        });
        tela.getLblMiniatura4().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                tela.getLblImagem().setIcon(new ProxyImagemModel("EUANoite", "https://pixabay.com/get/g0d2dc18a11ccaed41eee8c4b6529013946fb82a98794a787e0185426ca1c2ca1ad6786631757c047894f668bc40a9b10_1920.jpg").display());
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                tela.getLblMiniatura4().setBorder(new MetalBorders.OptionDialogBorder());
            }

            @Override
            public void mouseExited(MouseEvent e) {
                tela.getLblMiniatura4().setBorder(null);
            }
        });
        tela.getLblMiniatura5().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                tela.getLblImagem().setIcon(new ProxyImagemModel("Europa", "https://pixabay.com/get/gba9fcf8c626dbc489d27b155cb71dd3979f924a7bafcbbabfbdb11ea3ace247f803f76ceca2c091bee730c0a77974e8f_1920.jpg").display());
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                tela.getLblMiniatura5().setBorder(new MetalBorders.OptionDialogBorder());
            }

            @Override
            public void mouseExited(MouseEvent e) {
                tela.getLblMiniatura5().setBorder(null);
            }
        });
    }

}
