package swift_main;

import templates.ContentPanel;

public class SwContentPanelDoc extends ContentPanel {

	SwContentPanelDoc(){
		super();
		rf.writeTitle("Swift 공식문서", this);
		rf.readText("TxtFiles/SwiftTxt/swift_doc.txt",this );
	}
	
}
