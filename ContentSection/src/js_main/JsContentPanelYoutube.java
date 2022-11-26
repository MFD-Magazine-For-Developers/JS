package js_main;

import java.awt.Dimension;
import java.awt.FlowLayout;

import templates.ContentPanel;
import templates.MainPanel;
import templates.ReadingFile;

public class JsContentPanelYoutube extends ContentPanel {

	public JsContentPanelYoutube() {
		super();
		rf.writeTitle("JS 추천 유튜브", this);
		rf.readText("TxtFiles/JSTxt/js_youtube.txt", this);

	}

}
