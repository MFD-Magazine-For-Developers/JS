package java_main;

import java.awt.Dimension;
import java.awt.FlowLayout;

public class ContentPanelYoutube extends ContentPanel {

	public ContentPanelYoutube() {
		super();
		ReadingFile rf = new ReadingFile();
		setLayout(new FlowLayout(FlowLayout.LEFT, 100, 35));
		setBackground(JavaMainPanel.defaultContentColor);
		setPreferredSize(new Dimension(500, 5000));

		rf.writeTitle("Java 추천 유튜브", this);
		rf.readText("javaTxt/java_youtube.txt", this);

	}

}
