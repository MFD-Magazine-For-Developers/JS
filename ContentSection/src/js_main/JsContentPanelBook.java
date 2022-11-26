package js_main;

import java.awt.Dimension;
import java.awt.FlowLayout;

import templates.ContentPanel;
import templates.MainPanel;
import templates.ReadingFile;

public class JsContentPanelBook extends ContentPanel {

	public JsContentPanelBook() {

		super();
		rf.writeTitle("JS 추천 도서", this);
		rf.readText("TxtFiles/JSTxt/js_book.txt", this);

	}

}
