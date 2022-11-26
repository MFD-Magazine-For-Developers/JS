package java_main;

import templates.ContentPanel;

public class JContentPanelBook extends ContentPanel {

	public JContentPanelBook() {

		super();
		rf.writeTitle("Java 추천 도서", this);
		rf.readText("TxtFiles/JavaTxt/java_book.txt", this);

	}
	
	
}
