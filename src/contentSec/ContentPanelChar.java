package contentSec;

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

		rf.writeTitle("JS로 할 수 있는 것들", this);

		rf.readImage("imges/meta.png", defaultImgWidth, 300, this);
		rf.readText("JS/js_meta.txt", this);
		rf.readImage("imges/hangout.png", 310, 300, this);
		rf.readImage("imges/discord.png", 310, 300, this);
		rf.readText("JS/hangout.txt", this);
		rf.readImage("imges/map.png", defaultImgWidth, 300, this);
		rf.readText("JS/map.txt", this);

	}
}
