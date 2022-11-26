package templates;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JPanel;

public abstract class ContentPanel extends JPanel {

	public Font defaultTitleFont = new Font("Gmarket Sans", Font.BOLD, 35);
	public Font defaultTextFont = new Font("Gmarket Sans", Font.BOLD, 15);
	public Font defaultDescriptionFont = new Font("Gmarket Sans", Font.PLAIN, 10);
	public int defaultTitleWidth = 800;
	public int defaultTitleHeight = 80;
	public int defaultContentWidth = 700;
	public int defaultContentHeight = 700;
	public int defaultImgWidth = 500;
	protected ReadingFile rf;
	public ContentPanel(){
		 rf = new ReadingFile();
		setLayout(new FlowLayout(FlowLayout.LEFT, 100, 35));
		setBackground(MainPanel.defaultContentColor);
		setPreferredSize(new Dimension(500, 5000));
	}
	

}
