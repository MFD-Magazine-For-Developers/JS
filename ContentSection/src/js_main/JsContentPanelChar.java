package js_main;

import java.awt.Dimension;
import java.awt.FlowLayout;

import templates.ContentPanel;
import templates.MainPanel;
import templates.ReadingFile;

public class JsContentPanelChar extends ContentPanel {

	public JsContentPanelChar() {

		rf.writeTitle("JS의 특징", this);
		rf.readText("TxtFiles/JSTxt/characteristic.txt", this);

	}
}
