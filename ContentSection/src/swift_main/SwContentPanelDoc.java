package swift_main;

import templates.ContentPanel;
import templates.CreateHyperLinkClass;

public class SwContentPanelDoc extends ContentPanel {

	SwContentPanelDoc(){
		super();
		rf.writeTitle("Swift 공식문서", this);
		new CreateHyperLinkClass("Swift 공식문서","https://www.swift.org/",this);
	}
	
}
