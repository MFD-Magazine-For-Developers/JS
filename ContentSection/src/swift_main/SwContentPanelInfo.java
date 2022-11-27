package swift_main;

import java.awt.Dimension;
import java.awt.FlowLayout;

import templates.ContentPanel;
import templates.MainPanel;
import templates.ReadingFile;

public class SwContentPanelInfo extends ContentPanel {

	SwContentPanelInfo(){
		super();
		rf.writeTitle("Swift소개", this); // 각 챕터의 이름입니다.
		rf.readText("TxtFiles/SwiftTxt/swift_intro.txt", this);

	}
}
