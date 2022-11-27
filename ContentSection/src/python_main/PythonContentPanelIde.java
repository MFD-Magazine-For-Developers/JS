package python_main;

import templates.ContentPanel;

public class PythonContentPanelIde extends ContentPanel{

	PythonContentPanelIde(){
		super();
		rf.writeTitle("개발 환경", this);
		rf.readText("TxtFiles/PythonTxt/python_ide.txt", this);
	}
	
	
}
