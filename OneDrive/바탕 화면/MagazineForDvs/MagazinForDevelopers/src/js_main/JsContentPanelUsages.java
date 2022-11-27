package js_main;

import java.awt.Dimension;
import java.awt.FlowLayout;

import templates.ContentPanel;
import templates.MainPanel;
import templates.ReadingFile;


public class JsContentPanelUsages extends ContentPanel {

	
	public JsContentPanelUsages() {
		rf.writeTitle("JS로 할 수 있는 것들", this);
		rf.readImage("images/meta.png", defaultImgWidth, 300, this);
		rf.readText("TxtFiles/JSTxt/js_meta.txt", this);
		rf.readImage("images/hangout.png", 310, 300, this);
		rf.readImage("images/discord.png", 310, 300, this);
		rf.readText("TxtFiles/JSTxt/hangout.txt", this);
		rf.readImage("images/map.png", defaultImgWidth, 300, this);
		rf.readText("TxtFiles/JSTxt/map.txt", this);
		
	}
	
	
}
