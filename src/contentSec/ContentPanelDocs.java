package contentSec;

import java.awt.Dimension;
import java.awt.FlowLayout;

public class ContentPanelDocs extends ContentPanel {

	public ContentPanelDocs() {
		super();
		ReadingFile rf = new ReadingFile();
		setLayout(new FlowLayout(FlowLayout.LEFT, 100, 35));
		setBackground(JsMainPanel.defaultContentColor);
		setPreferredSize(new Dimension(500, 5000));

		rf.writeTitle("JS 공식 문서", this); // 각 챕터의 이름입니다.
		rf.readText("JS/js_docs.txt", this);
	}

}
