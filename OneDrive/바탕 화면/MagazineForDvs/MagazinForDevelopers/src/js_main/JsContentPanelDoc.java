package js_main;

import java.awt.Dimension;
import java.awt.FlowLayout;

import templates.ContentPanel;
import templates.CreateHyperLinkClass;
import templates.MainPanel;
import templates.ReadingFile;

public class JsContentPanelDoc extends ContentPanel {

	public JsContentPanelDoc() {
		super();
		rf.writeTitle("JS 공식 문서", this); // 각 챕터의 이름입니다.
		new CreateHyperLinkClass("Js 공식 문서","https://developer.mozilla.org/ko/",this);
	}

}
