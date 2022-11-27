package js_main;

import templates.ContentPanel;
import templates.CreateHyperLinkClass;

public class JsContentPanelDoc extends ContentPanel {

	public JsContentPanelDoc() {
		super();
		rf.writeTitle("JS 공식 문서", this); // 각 챕터의 이름입니다.
		new CreateHyperLinkClass("Js 공식 문서","https://developer.mozilla.org/ko/",this);
	}

}
