package swift_main;

import templates.ContentPanel;

public class SwContentPanelProject extends ContentPanel {

	SwContentPanelProject(){
		super();
		rf.writeTitle("프로젝트", this);
		rf.readText("TxtFiles/SwiftTxt/swift_project.txt", this);
	}
	
	
}
