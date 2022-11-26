package js_main;

import java.awt.Dimension;
import java.awt.FlowLayout;

import templates.ContentPanel;
import templates.MainPanel;
import templates.ReadingFile;

public class JsContentPanelLecture extends ContentPanel {

	public JsContentPanelLecture() {
		super();
		rf.writeTitle("JS 추천 강의", this); // 각 챕터의 이름입니다.
		rf.readText("TxtFiles/JSTxt/js_lecture.txt", this);

	}
}
