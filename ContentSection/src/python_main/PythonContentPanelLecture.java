package python_main;

import templates.ContentPanel;

public class PythonContentPanelLecture extends ContentPanel{

	PythonContentPanelLecture(){
		super();
		rf.writeTitle("추천 강의", this);
		rf.readText("TxtFiles/PythonTxt/python_lectures.txt", this);
	}
	
	
}
