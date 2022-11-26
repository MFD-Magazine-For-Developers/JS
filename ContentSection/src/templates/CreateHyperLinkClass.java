package templates;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.JLabel;
 
public class CreateHyperLinkClass {
    private String text;
    private JLabel hyperlink;
 
    public CreateHyperLinkClass(String text, String linkText, ContentPanel cp) throws HeadlessException {

    	this.text = text;
    	hyperlink = new JLabel(text);
    	
        hyperlink.setCursor(new Cursor(Cursor.HAND_CURSOR));
 
        hyperlink.addMouseListener(new MouseAdapter() {
 
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI(linkText));
                } catch (IOException | URISyntaxException e1) {
                    e1.printStackTrace();
                }
            }
 
            @Override
            public void mouseExited(MouseEvent e) {
                hyperlink.setText(text);
            }
 
            @Override
            public void mouseEntered(MouseEvent e) {
                hyperlink.setText("<html><a href=''>" + text + "</a></html>");
            }
 
        });
        
        // 집어 넣을 클래스 명시
        hyperlink.setPreferredSize(new Dimension(800,50));
        hyperlink.setFont(new Font("Gmarket Sans", Font.BOLD, 15));
        cp.add(hyperlink);
        
        
        
    }

}