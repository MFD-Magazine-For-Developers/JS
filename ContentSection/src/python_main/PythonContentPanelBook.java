package python_main;

import templates.ContentPanel;

public class PythonContentPanelBook extends ContentPanel{

	PythonContentPanelBook(){
		super();
		rf.writeTitle("추천 도서", this);
		rf.readText("TxtFiles/PythonTxt/python_books.txt", this);
	}
	
	
}