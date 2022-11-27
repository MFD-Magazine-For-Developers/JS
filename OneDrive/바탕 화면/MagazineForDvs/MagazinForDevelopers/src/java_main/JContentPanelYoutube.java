package java_main;

import java.awt.Dimension;
import java.awt.FlowLayout;

import templates.ContentPanel;
import templates.CreateHyperLinkClass;
import templates.MainPanel;
import templates.ReadingFile;

public class JContentPanelYoutube extends ContentPanel {

	public JContentPanelYoutube() {
		super();
		rf.writeTitle("Java 추천 유튜브", this);
		new CreateHyperLinkClass("생활 코딩 ","https://youtu.be/jdTsJzXmgU0",this);
		new CreateHyperLinkClass("남궁성의 정석코딩 ","https://youtu.be/oJlCC1DutbA",this);

	}

}