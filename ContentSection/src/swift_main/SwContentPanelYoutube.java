package swift_main;

import templates.ContentPanel;
import templates.CreateHyperLinkClass;

public class SwContentPanelYoutube extends ContentPanel{

	SwContentPanelYoutube(){
		super();
		rf.writeTitle("추천 유튜버", this);
		new CreateHyperLinkClass("iOS Academy","https://www.youtube.com/c/iOSAcademy",this);
		new CreateHyperLinkClass("yagom","https://www.youtube.com/c/yagom",this);
	}
	
	
}
