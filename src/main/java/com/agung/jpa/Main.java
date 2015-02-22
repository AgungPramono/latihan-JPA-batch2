/*
 * Silahkan digunakan dengan bebas / dimodifikasi
 * Dengan tetap mencantumkan nama @author dan Referensi / Source
 * Terima Kasih atas Kerjasamanya.
 */
package com.agung.jpa;


import javax.swing.SwingUtilities;
import javax.swing.UnsupportedLookAndFeelException;
/**
 *
 * @author Agung Pramono
 */
public class Main {
    public static void main(String[]args) throws ClassNotFoundException, 
                                    InstantiationException, IllegalAccessException, 
                                    UnsupportedLookAndFeelException{
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
      SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                FormBiodata form = new FormBiodata();
                form.setVisible(true); 
            }
        });
    }
}
