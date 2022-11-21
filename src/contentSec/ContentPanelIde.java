package contentSec;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ContentPanelIde extends JPanel  {
	
	int defaultX = 100;
	int defaultMarginY = 50;
	int defaultDesWidth = 900;
	public Font defaultFontsStyle_big =  new Font("forte",Font.BOLD, 35);
	public Font defaultFontsStyle_small =  new Font("forte",Font.BOLD, 15);
	public Font defaultFontsStyle_smaller =  new Font("forte",Font.PLAIN, 10);

	public ContentPanelIde () {
		
		setLayout(null);
		setBackground(JsMainPanel.defaultContentColor);	
		setPreferredSize(new Dimension(1000,5000));

		JLabel intro_H = new JLabel("<html>페이지Ex3</html>");
		intro_H.setFont(defaultFontsStyle_big);
		intro_H.setBounds(defaultX, defaultMarginY, 250, 70);
		add(intro_H); //js 소개

	}
	
	
}
