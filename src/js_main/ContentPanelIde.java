package js_main;

import java.awt.Dimension;
import java.awt.FlowLayout;

public class ContentPanelIde extends ContentPanel {

	public ContentPanelIde() {

		super();
		ReadingFile rf = new ReadingFile();
		setLayout(new FlowLayout(FlowLayout.LEFT, 100, 35));
		setBackground(JsMainPanel.defaultContentColor);
		setPreferredSize(new Dimension(500, 5000));

		rf.writeTitle("JS 개발 환경", this); // 각 챕터의 이름입니다.
		rf.readText("jsTxt/js_ide.txt", this);
	}

}
