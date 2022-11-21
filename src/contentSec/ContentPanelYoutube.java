package contentSec;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ContentPanelYoutube extends JPanel  {

	public Font defaultTitleFont = new Font("forte",Font.BOLD, 35);
	public Font defaultTextFont = new Font("forte",Font.BOLD, 15);
	public Font defaultDescriptionFont = new Font("forte",Font.PLAIN, 10);
	public int defaultTitleWidth = 800;
	public int defaultTitleHeight = 80;
	public int defaultContentWidth = 700;
	public int defaultContentHeight = 700;
	public int defaultImgWidth = 500;
	public ContentPanelYoutube () {
		
		ReadingFile rf = new ReadingFile();
		setLayout(new FlowLayout(FlowLayout.LEFT,100,35));
		setBackground(JsMainPanel.defaultContentColor);
		setPreferredSize(new Dimension(500,5000));
		
		JLabel sectionTitleLabel = new JLabel("<html>JS로 할 수 있는 것들</html>"); // JLabel의 컨텐츠를 각자 바꿔주시면 됩니다.
		sectionTitleLabel.setFont(defaultTitleFont);
		sectionTitleLabel.setSize(defaultTitleWidth, defaultTitleHeight);
		add(sectionTitleLabel); // SectionTitleLabel 
		
		
		
		

	}
	
	
}
