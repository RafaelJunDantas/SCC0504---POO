package Controler;

import Auxiliar.Consts;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class JOptionPaneExample {

    public void displayGUI() {
        JOptionPane.showConfirmDialog(null,
                getPanel(),
                "JOptionPane Example : ",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE);
    }

    private JPanel getPanel() {
        JPanel panel = new JPanel();
        JLabel label = new JLabel("<html>" + "<h2 style=\"color: #5e9ca0;\"><span style=\"color: #2b2301;\">Voc&ecirc; pode editar uma fase</span></h2>\n" +
                "<h4 style=\"color: #2e6c80;\"><span style=\"color: #ff6600;\">Aperte de F1 pra ir pra fase 1; F2 pra ir pra fase 2; F3 pra ir pra fase 3.</span></h4>\n" +
                "<p><span style=\"color: #000000;\">OU:</span></p>\n" +
                "<h3 style=\"color: #2e6c80;\"><span style=\"color: #000000;\">Aperte de 1 a 8 para adicionar:</span></h3>\n" +
                "<ol style=\"list-style: none; font-size: 14px; line-height: 32px; font-weight: bold;\">\n" +
                "<li style=\"clear: both;\">Cobrinha</li>\n" +
                "<li style=\"clear: both;\">Caveira</li>\n" +
                "<li style=\"clear: both;\">Tatu</li>\n" +
                "<li style=\"clear: both;\">&Aacute;rvore</li>\n" +
                "<li style=\"clear: both;\">Pedra</li>\n" +
                "<li style=\"clear: both;\">&Aacute;gua</li>\n" +
                "<li style=\"clear: both;\">planta</li>\n" +
                "<li style=\"clear: both;\">caixa</li>\n" +
                "</ol>\n" +
                "<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;</p>" + "</html>");

        ImageIcon image = new ImageIcon();
        try {
            image = new ImageIcon(new java.io.File(".").getCanonicalPath() + Consts.PATH + "lolo.png");
            Image img = image.getImage();
            BufferedImage bi = new BufferedImage(Consts.CELL_SIDE, Consts.CELL_SIDE, BufferedImage.TYPE_INT_ARGB);
            Graphics g = bi.createGraphics();
            g.drawImage(img, 0, 0, Consts.CELL_SIDE, Consts.CELL_SIDE, null);
            image = new ImageIcon(bi);
           /* image = new ImageIcon(ImageIO.read(
                    new URL("http://i.imgur.com/6mbHZRU.png")));*/
        } catch(IOException mue) {
            mue.printStackTrace();
        }

        label.setIcon(image);
        panel.add(label);

        return panel;
    }


}