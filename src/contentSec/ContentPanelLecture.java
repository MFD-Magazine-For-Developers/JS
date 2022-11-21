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

public class ContentPanelLecture extends ContentPanel {

	public ContentPanelLecture () {

		super();
		ReadingFile rf = new ReadingFile();
		setLayout(new FlowLayout(FlowLayout.LEFT,100,35));
		setBackground(JsMainPanel.defaultContentColor);
		setPreferredSize(new Dimension(500,5000));
		
		rf.writeTitle("JS강의", this); // 각 챕터의 이름입니다.
		
		
		
	}
}
