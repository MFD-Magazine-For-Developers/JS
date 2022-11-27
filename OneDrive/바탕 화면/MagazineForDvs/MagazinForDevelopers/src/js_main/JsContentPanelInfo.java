package js_main;

import java.awt.Dimension;
import java.awt.FlowLayout;

import templates.ContentPanel;
import templates.MainPanel;
import templates.ReadingFile;

public class JsContentPanelInfo extends ContentPanel {

	public JsContentPanelInfo() {

		super();
		rf.writeTitle("Java Script 소개", this); // 각 챕터의 이름입니다.

		rf.readText("TxtFiles/JSTxt/intro.txt", this);
		rf.readImage("images/intro_html.png", defaultImgWidth, 350, this);
		rf.readText("TxtFiles/JSTxt/css.txt", this);
		rf.readImage("images/intro_css.png", defaultImgWidth, 300, this);
		rf.readText("TxtFiles/JSTxt/js.txt", this);
		rf.readImage("images/intro_login.png", defaultImgWidth, 200, this);
		rf.readText("TxtFiles/JSTxt/js_logIn.txt", this);
		rf.readImage("images/intro_js.png", defaultImgWidth, 400, this);

	}

}
