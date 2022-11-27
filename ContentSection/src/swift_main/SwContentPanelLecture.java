package swift_main;

import templates.ContentPanel;
import templates.CreateHyperLinkClass;

public class SwContentPanelLecture extends ContentPanel{
	
	public SwContentPanelLecture(){
		super();
		rf.writeTitle("Swift 추천강의", this);
		new CreateHyperLinkClass("왕초보를 위한 스위프트 프로그래밍 강좌 (iOS app with xcode&swift)","https://inf.run/cW2M",this);
		new CreateHyperLinkClass("개발하는 정대리 스위프트 기초 문법","https://inf.run/VaKj",this);
	}

}
