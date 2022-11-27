package js_main;

import java.awt.Dimension;
import java.awt.FlowLayout;

import templates.ContentPanel;
import templates.CreateHyperLinkClass;
import templates.MainPanel;
import templates.ReadingFile;

public class JsContentPanelYoutube extends ContentPanel {

	public JsContentPanelYoutube() {
		super();
		rf.writeTitle("JS 추천 유튜브", this);
		new CreateHyperLinkClass("리베하얀","https://www.youtube.com/user/rebehayan",this);
		new CreateHyperLinkClass("1분코딩","https://www.youtube.com/c/1분코딩/videos",this);
		new CreateHyperLinkClass("programming with Mosh","https://www.youtube.com/c/programmingwithmosh",this);
		new CreateHyperLinkClass("생활코딩","https://www.youtube.com/c/생활코딩1",this);
		new CreateHyperLinkClass("드림코딩","https://www.youtube.com/c/드림코딩by엘리",this);
	}

}
