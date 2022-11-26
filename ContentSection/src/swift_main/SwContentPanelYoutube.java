package swift_main;

import templates.ContentPanel;

public class SwContentPanelYoutube extends ContentPanel{

	SwContentPanelYoutube(){
		super();
		rf.writeTitle("추천 유튜버", this);
		rf.readText("TxtFiles/SwiftTxt/swift_YouTuber.txt", this);
	}
	
	
}
