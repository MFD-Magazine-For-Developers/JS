package js_main;

import java.awt.Dimension;
import java.awt.FlowLayout;

import templates.ContentPanel;
import templates.CreateHyperLinkClass;
import templates.MainPanel;
import templates.ReadingFile;

public class JsContentPanelIde extends ContentPanel {

	public JsContentPanelIde() {

		super();
		rf.writeTitle("JS 개발 환경", this); // 각 챕터의 이름입니다.
		new CreateHyperLinkClass("https://poiemaweb.com/js-hello-world ","https://poiemaweb.com/js-hello-world",this);
	}

}
