package java_main;

import templates.ContentPanel;

public class JContentPanelInfo extends ContentPanel {

	public JContentPanelInfo() {

		super();

		rf.writeTitle("Java소개", this); // 각 챕터의 이름입니다.
		rf.readText("TxtFiles/JavaTxt/Java_info.txt", this);

	}

}