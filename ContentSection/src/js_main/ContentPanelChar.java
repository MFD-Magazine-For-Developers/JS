package js_main;

import java.awt.Dimension;
import java.awt.FlowLayout;

public class ContentPanelChar extends ContentPanel {

	public ContentPanelChar() {
		ReadingFile rf = new ReadingFile();
		setLayout(new FlowLayout(FlowLayout.LEFT, 100, 35));
		setBackground(JsMainPanel.defaultContentColor);
		setPreferredSize(new Dimension(500, 5000));

		rf.writeTitle("JS의 특징", this);

		rf.readText("JS/characteristic.txt", this);

	}
}
