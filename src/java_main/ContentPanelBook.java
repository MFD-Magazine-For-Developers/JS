package java_main;

import java.awt.Dimension;
import java.awt.FlowLayout;

public class ContentPanelBook extends ContentPanel {

	public ContentPanelBook() {

		super();
		ReadingFile rf = new ReadingFile();
		setLayout(new FlowLayout(FlowLayout.LEFT, 100, 35));
		setBackground(JavaMainPanel.defaultContentColor);
		setPreferredSize(new Dimension(500, 5000));

		rf.writeTitle("Java μΆμ² λμ", this);
		rf.readText("javaTxt/java_book.txt", this);

	}
}