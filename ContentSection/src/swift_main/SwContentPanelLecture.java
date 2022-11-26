package swift_main;

import templates.ContentPanel;

public class SwContentPanelLecture extends ContentPanel{
	
	public SwContentPanelLecture(){
		super();
		rf.writeTitle("Swift 추천강의", this);
		rf.readText("TxtFiles/SwiftTxt/swift_lecture.txt", this);
	}

}
