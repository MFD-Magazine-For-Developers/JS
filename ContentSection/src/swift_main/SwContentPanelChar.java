package swift_main;

import templates.ContentPanel;

public class SwContentPanelChar extends ContentPanel{
	
	public SwContentPanelChar() {
		super();
		rf.writeTitle("Swift소개", this); // 각 챕터의 이름입니다.
		rf.readText("TxtFiles/SwiftTxt/swift_char.txt", this);
	}
	
}
