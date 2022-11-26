package python_main;

import templates.ContentPanel;

public class PythonContentPanelDoc extends ContentPanel{

	PythonContentPanelDoc(){
		super();
		rf.writeTitle("공식문서 및 홈페이지", this);
		rf.readText("TxtFiles/PythonTxt/python_doc.txt", this);
	}
	
	
}