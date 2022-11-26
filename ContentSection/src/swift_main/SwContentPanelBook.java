package swift_main;

import templates.ContentPanel;

public class SwContentPanelBook extends ContentPanel {

	public SwContentPanelBook(){
		super();
		rf.writeTitle("Swift 추천 도서", this);
		
		
		rf.readText("TxtFiles/SwiftTxt/swift_book.txt", this);
	}
	
}
