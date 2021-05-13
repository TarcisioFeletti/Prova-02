/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.sensoriamentoremoto.Presenter;

import com.pss.sensoriamentoremoto.Model.ProxyImagemModel;
import com.pss.sensoriamentoremoto.View.PrincipalView;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

/**
 *
 * @author tarci
 */
public class PrincipalPresenter{

    private PrincipalView tela;

    public PrincipalPresenter() {
        PrincipalView tela = new PrincipalView();
        tela.setLocationRelativeTo(tela.getParent());
        tela.setExtendedState(PrincipalView.MAXIMIZED_BOTH);
        tela.setVisible(true);
        tela.getLblMiniatura1().setIcon(new ImageIcon(new ImageIcon("C:\\Users\\tarci\\OneDrive\\Documentos\\Estudos\\2020 2\\PSS\\"
                + "Prova02\\prova02\\sensoriamentoRemoto\\src\\main\\java\\com\\pss\\sensoriamentoremoto\\Imagens\\"
                + "africa640.jpg").
                getImage().getScaledInstance(100, 100, 0)));
        tela.getLblMiniatura2().setIcon(new ImageIcon(new ImageIcon("C:\\Users\\tarci\\OneDrive\\Documentos\\Estudos\\2020 2\\PSS\\"
                + "Prova02\\prova02\\sensoriamentoRemoto\\src\\main\\java\\com\\pss\\sensoriamentoremoto\\Imagens\\"
                + "australia640.jpg").
                getImage().getScaledInstance(100, 100, 0)));
        tela.getLblMiniatura3().setIcon(new ImageIcon(new ImageIcon("C:\\Users\\tarci\\OneDrive\\Documentos\\Estudos\\2020 2\\PSS\\"
                + "Prova02\\prova02\\sensoriamentoRemoto\\src\\main\\java\\com\\pss\\sensoriamentoremoto\\Imagens\\"
                + "egito640.jpg").
                getImage().getScaledInstance(100, 100, 0)));
        tela.getLblMiniatura4().setIcon(new ImageIcon(new ImageIcon("C:\\Users\\tarci\\OneDrive\\Documentos\\Estudos\\2020 2\\PSS\\"
                + "Prova02\\prova02\\sensoriamentoRemoto\\src\\main\\java\\com\\pss\\sensoriamentoremoto\\Imagens\\"
                + "cyclone640.jpg").
                getImage().getScaledInstance(100, 100, 0)));
        tela.getLblMiniatura5().setIcon(new ImageIcon(new ImageIcon("C:\\Users\\tarci\\OneDrive\\Documentos\\Estudos\\2020 2\\PSS\\"
                + "Prova02\\prova02\\sensoriamentoRemoto\\src\\main\\java\\com\\pss\\sensoriamentoremoto\\Imagens\\"
                + "hurricane640.jpg").
                getImage().getScaledInstance(100, 100, 0)));
        iniciarListeners(tela);
    }

    public void iniciarListeners(PrincipalView tela) {
        tela.getLblMiniatura1().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ProxyImagemModel proxyImagem = ProxyImagemModel.getInstancia();
                proxyImagem.setNomeImagem("africa1920.jpg");
                tela.getLblImagem().setIcon(proxyImagem.display());
            }

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                tela.getLblMiniatura1().setBorder(new LineBorder(Color.BLACK));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                tela.getLblMiniatura1().setBorder(null);
            }
        });
        tela.getLblMiniatura2().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ProxyImagemModel proxyImagem = ProxyImagemModel.getInstancia();
                proxyImagem.setNomeImagem("australia1920.jpg");
                tela.getLblImagem().setIcon(proxyImagem.display());
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                tela.getLblMiniatura2().setBorder(new LineBorder(Color.BLACK));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                tela.getLblMiniatura2().setBorder(null);
            }
        });
        tela.getLblMiniatura3().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ProxyImagemModel proxyImagem = ProxyImagemModel.getInstancia();
                proxyImagem.setNomeImagem("egito1920.jpg");
                tela.getLblImagem().setIcon(proxyImagem.display());
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                tela.getLblMiniatura3().setBorder(new LineBorder(Color.BLACK));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                tela.getLblMiniatura3().setBorder(null);
            }
        });
        tela.getLblMiniatura4().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ProxyImagemModel proxyImagem = ProxyImagemModel.getInstancia();
                proxyImagem.setNomeImagem("cyclone1920.jpg");
                tela.getLblImagem().setIcon(proxyImagem.display());
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                tela.getLblMiniatura4().setBorder(new LineBorder(Color.BLACK));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                tela.getLblMiniatura4().setBorder(null);
            }
        });
        tela.getLblMiniatura5().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ProxyImagemModel proxyImagem = ProxyImagemModel.getInstancia();
                proxyImagem.setNomeImagem("hurricane1920.jpg");
                tela.getLblImagem().setIcon(proxyImagem.display());
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                tela.getLblMiniatura5().setBorder(new LineBorder(Color.BLACK));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                tela.getLblMiniatura5().setBorder(null);
            }
        });
    }

}
