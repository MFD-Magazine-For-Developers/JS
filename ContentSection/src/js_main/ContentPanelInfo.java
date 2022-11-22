package js_main;

import java.awt.Dimension;
import java.awt.FlowLayout;

public class ContentPanelInfo extends ContentPanel {

	public ContentPanelInfo() {

		super();
		ReadingFile rf = new ReadingFile();
		setLayout(new FlowLayout(FlowLayout.LEFT, 100, 35));
		setBackground(JsMainPanel.defaultContentColor);
		setPreferredSize(new Dimension(500, 5000));

		rf.writeTitle("JS소개", this); // 각 챕터의 이름입니다.

		rf.readText("Js/intro.txt", this);
		rf.readImage("imges/intro_html.png", defaultImgWidth, 350, this);
		rf.readText("Js/css.txt", this);
		rf.readImage("imges/intro_css.png", defaultImgWidth, 300, this);
		rf.readText("Js/js.txt", this);
		rf.readImage("imges/intro_login.png", defaultImgWidth, 200, this);
		rf.readText("Js/js_logIn.txt", this);
		rf.readImage("imges/intro_js.png", defaultImgWidth, 400, this);

	}

}
