package java_main;

import java.awt.Dimension;
import java.awt.FlowLayout;

public class ContentPanelChar extends ContentPanel {

	public ContentPanelChar() {
		super();
		ReadingFile rf = new ReadingFile();
		setLayout(new FlowLayout(FlowLayout.LEFT, 100, 35));
		setBackground(JavaMainPanel.defaultContentColor);
		setPreferredSize(new Dimension(500, 5000));

		rf.writeTitle("Java의 특징", this);
		rf.readText("javaTxt/java_char.txt", this);
	}
}
