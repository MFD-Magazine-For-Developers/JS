package contentSec;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ContentPanelLecture extends JPanel {
//
//	int defaultX = 100;
//	int defaultMarginY = 50;
//	int defaultDesWidth = 900;
//	public Font defaultFontsStyle_big =  new Font("forte",Font.BOLD, 35);
//	public Font defaultFontsStyle_small =  new Font("forte",Font.BOLD, 15);
//	public Font defaultFontsStyle_smaller =  new Font("forte",Font.PLAIN, 10);
	
	public Font defaultTitleFont = new Font("forte",Font.BOLD, 35);
	public Font defaultTextFont = new Font("forte",Font.BOLD, 15);
	public Font defaultDescriptionFont = new Font("forte",Font.PLAIN, 10);
	public int defaultTitleWidth = 800;
	public int defaultTitleHeight = 80;
	public int defaultContentWidth = 700;
	public int defaultContentHeight = 700;

	public ContentPanelLecture () {

		ReadingFile rf = new ReadingFile();
		setLayout(new FlowLayout(FlowLayout.LEFT,100,50));
		setBackground(JsMainPanel.defaultContentColor);
		setPreferredSize(new Dimension(500,5000));
		
		JLabel sectionTitleLabel = new JLabel("<html>JS 소개</html>"); // JLabel의 컨텐츠를 각자 바꿔주시면 됩니다.
		sectionTitleLabel.setFont(defaultTitleFont);
		sectionTitleLabel.setSize(defaultTitleWidth, defaultTitleHeight);
		add(sectionTitleLabel); // SectionTitleLabel 
		
		String content = rf.read("Js/intro.txt");
		JLabel contentLabel = new JLabel(content);
		contentLabel.setFont(defaultTextFont);
		contentLabel.setMaximumSize(new Dimension(defaultContentWidth,defaultContentHeight));
		add(contentLabel);//html
		
		ImageIcon intro_html_img = new ImageIcon(new ImageIcon("imges/intro_html.png").getImage().getScaledInstance(500, 350, Image.SCALE_DEFAULT));
		JLabel intro_html_label = new JLabel(intro_html_img);
		add(intro_html_label);//html img
		
		String content2 = rf.read("Js/css.txt");
		JLabel contentLabel2 = new JLabel(content2);
		contentLabel2.setFont(defaultTextFont);
		contentLabel2.setMaximumSize(new Dimension(defaultContentWidth,defaultContentHeight));
		add(contentLabel2);// css
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
