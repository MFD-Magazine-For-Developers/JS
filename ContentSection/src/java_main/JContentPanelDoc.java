package java_main;

import java.awt.Dimension;
import java.awt.FlowLayout;

import templates.ContentPanel;
import templates.MainPanel;
import templates.ReadingFile;

public class JContentPanelDoc extends ContentPanel {

	public JContentPanelDoc() {
		super();
		rf.writeTitle("Java 공식 문서", this); // 각 챕터의 이름입니다.
		rf.readText("TxtFiles/JavaTxt/java_docs.txt", this);
	}

}
