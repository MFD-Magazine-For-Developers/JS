package contentSec;

import java.awt.Dimension;
import java.awt.FlowLayout;

public class ContentPanelLecture extends ContentPanel {

	public ContentPanelLecture() {

		super();
		ReadingFile rf = new ReadingFile();
		setLayout(new FlowLayout(FlowLayout.LEFT, 100, 35));
		setBackground(JsMainPanel.defaultContentColor);
		setPreferredSize(new Dimension(500, 5000));

		rf.writeTitle("JS 추천 강의", this); // 각 챕터의 이름입니다.
		rf.readText("Js/js_lecture.txt", this);

	}
}
