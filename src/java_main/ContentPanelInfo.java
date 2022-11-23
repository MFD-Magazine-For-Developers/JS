package java_main;

import java.awt.Dimension;
import java.awt.FlowLayout;

public class ContentPanelInfo extends ContentPanel {

	public ContentPanelInfo() {

		super();
		ReadingFile rf = new ReadingFile();
		setLayout(new FlowLayout(FlowLayout.LEFT, 100, 35));
		setBackground(JavaMainPanel.defaultContentColor);
		setPreferredSize(new Dimension(500, 5000));

		rf.writeTitle("Java 소개", this); // 각 챕터의 이름입니다.
		rf.readText("javaTxt/java_info.txt", this);

	}

}
