package swift_main;

import templates.ContentPanel;

public class SwContentPanelIde extends ContentPanel {

	public SwContentPanelIde() {
		super();
		rf.writeTitle("Swift 개발 환경", this); // 각 챕터의 이름입니다.
		rf.readText("TxtFiles/SwiftTxt/swift_platform.txt", this);
	}
	
}
