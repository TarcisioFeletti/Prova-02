/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.sensoriamentoremoto.Presenter;

import com.pss.sensoriamentoremoto.Model.CacheModel;
import com.pss.sensoriamentoremoto.Model.Download;
import com.pss.sensoriamentoremoto.View.PrincipalView;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.plaf.metal.MetalBorders;

/**
 *
 * @author tarci
 */
public final class PrincipalPresenter {

    private PrincipalView tela;
    private CacheModel cache;

    public PrincipalPresenter() {
        tela = new PrincipalView();
        cache = new CacheModel();
        tela.setLocationRelativeTo(tela.getParent());
        tela.setVisible(true);
        try {
            tela.getLblMiniatura1().setIcon(Download.fromUrl("https://gitlab.com/TarcisioFeletti/imagens-prova02-pss/-/raw/master/africa640%20(1).jpg", 100, 100));
            tela.getLblMiniatura2().setIcon(Download.fromUrl("https://gitlab.com/TarcisioFeletti/imagens-prova02-pss/-/raw/master/australia640.jpg", 100, 100));
            tela.getLblMiniatura3().setIcon(Download.fromUrl("https://gitlab.com/TarcisioFeletti/imagens-prova02-pss/-/raw/master/europe640.jpg", 100, 100));
            tela.getLblMiniatura4().setIcon(Download.fromUrl("https://gitlab.com/TarcisioFeletti/imagens-prova02-pss/-/raw/master/map640.jpg", 100, 100));
            tela.getLblMiniatura5().setIcon(Download.fromUrl("https://gitlab.com/TarcisioFeletti/imagens-prova02-pss/-/raw/master/unitedstates640.jpg", 100, 100));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(tela, ex.getMessage());
        }
        iniciarListeners(tela);
    }

    public void iniciarListeners(PrincipalView tela) {
        tela.getLblMiniatura1().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    tela.getLblImagem().setIcon(cache.getProxy("Africa").display());
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(tela, ex.getMessage());
                } catch (NullPointerException ne) {
                    JOptionPane.showMessageDialog(tela, "Não foi possivel localizar o proxy");
                }
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
                try {
                    tela.getLblImagem().setIcon(cache.getProxy("Australia").display());
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(tela, ex.getMessage());
                } catch (NullPointerException ne) {
                    JOptionPane.showMessageDialog(tela, "Não foi possivel localizar o proxy");
                }
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
                try {
                    tela.getLblImagem().setIcon(cache.getProxy("Europa").display());
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(tela, ex.getMessage());
                } catch (NullPointerException ne) {
                    JOptionPane.showMessageDialog(tela, "Não foi possivel localizar o proxy");
                }
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
                try {
                    tela.getLblImagem().setIcon(cache.getProxy("Egito").display());
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(tela, ex.getMessage());
                } catch (NullPointerException ne) {
                    JOptionPane.showMessageDialog(tela, "Não foi possivel localizar o proxy");
                }
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
                try {
                    tela.getLblImagem().setIcon(cache.getProxy("EUA").display());
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(tela, ex.getMessage());
                } catch (NullPointerException ne) {
                    JOptionPane.showMessageDialog(tela, "Não foi possivel localizar o proxy");
                }
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
