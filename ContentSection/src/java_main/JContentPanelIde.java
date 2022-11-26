package java_main;

import java.awt.Dimension;
import java.awt.FlowLayout;

import templates.ContentPanel;
import templates.MainPanel;
import templates.ReadingFile;

public class JContentPanelIde extends ContentPanel {

	public JContentPanelIde() {

		super();
		rf.writeTitle("Java 개발 환경", this); // 각 챕터의 이름입니다.
		rf.readText("TxtFiles/JavaTxt/java_ide.txt", this);
	}

}
