package js_main;

import java.awt.Dimension;
import java.awt.FlowLayout;

import templates.ContentPanel;
import templates.MainPanel;
import templates.ReadingFile;

public class JsContentPanelIde extends ContentPanel {

	public JsContentPanelIde() {

		super();
		rf.writeTitle("JS 개발 환경", this); // 각 챕터의 이름입니다.
		rf.readText("TxtFiles/JSTxt/js_ide.txt", this);
	}

}
