package java_main;

import java.awt.Dimension;
import java.awt.FlowLayout;

import templates.ContentPanel;
import templates.MainPanel;
import templates.ReadingFile;

public class JContentPanelYoutube extends ContentPanel {

	public JContentPanelYoutube() {
		super();
		rf.writeTitle("Java 추천 유튜브", this);
		rf.readText("TxtFiles/JavaTxt/java_youtube.txt", this);

	}

}