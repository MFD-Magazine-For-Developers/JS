package js_main;

import java.awt.Dimension;
import java.awt.FlowLayout;

public class ContentPanelBook extends ContentPanel {

	public ContentPanelBook() {

		super();
		ReadingFile rf = new ReadingFile();
		setLayout(new FlowLayout(FlowLayout.LEFT, 100, 35));
		setBackground(JsMainPanel.defaultContentColor);
		setPreferredSize(new Dimension(500, 5000));

		rf.writeTitle("JS 추천 도서", this);
		rf.readText("Js/js_book.txt", this);

	}

}
