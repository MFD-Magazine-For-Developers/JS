package java_main;

import java.awt.Dimension;
import java.awt.FlowLayout;

import templates.ContentPanel;
import templates.CreateHyperLinkClass;
import templates.MainPanel;
import templates.ReadingFile;

public class JContentPanelLecture extends ContentPanel {

	public JContentPanelLecture() {
		super();
		rf.writeTitle("Java 추천 강의", this); // 각 챕터의 이름입니다.
		new CreateHyperLinkClass("생활 코딩 ","https://opentutorials.org/course/3930",this);
		new CreateHyperLinkClass("오렌지 미디어 ","http://www.orentec.co.kr/teachlist/JAVA_BASIC_1/teach_sub1.php",this);

	}
}
