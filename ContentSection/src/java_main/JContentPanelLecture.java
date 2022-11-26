package java_main;

import java.awt.Dimension;
import java.awt.FlowLayout;

import templates.ContentPanel;
import templates.MainPanel;
import templates.ReadingFile;

public class JContentPanelLecture extends ContentPanel {

	public JContentPanelLecture() {
		super();
		rf.writeTitle("Java 추천 강의", this); // 각 챕터의 이름입니다.
		rf.readText("TxtFiles/JavaTxt/java_lecture.txt", this);

	}
}
