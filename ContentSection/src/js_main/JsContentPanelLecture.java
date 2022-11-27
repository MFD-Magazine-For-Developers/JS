package js_main;

import templates.ContentPanel;
import templates.CreateHyperLinkClass;

public class JsContentPanelLecture extends ContentPanel {

	public JsContentPanelLecture() {
		super();
		rf.writeTitle("JS 추천 강의", this); // 각 챕터의 이름입니다.

		new CreateHyperLinkClass("코코아 클론 코딩","https://nomadcoders.co/kokoa-clone/lobby",this);
		new CreateHyperLinkClass("javaScript.info","https://ko.javascript.info/",this);
		new CreateHyperLinkClass("레츠기릿-자바스크립트","https://www.inflearn.com/course/레츠기릿-자바스크립트",this);
		new CreateHyperLinkClass("code with Mosh","https://codewithmosh.com/",this);
		
	}
}
