package python_main;

import templates.ContentPanel;

public class PythonContentPanelChar extends ContentPanel{

	PythonContentPanelChar(){
		super();
		rf.writeTitle("Python 특징", this);
		rf.readText("TxtFiles/PythonTxt/python_char.txt", this);
	}
	
	
}