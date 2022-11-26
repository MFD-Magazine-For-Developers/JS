package python_main;

import templates.ContentPanel;

public class PythonContentPanelUsages extends ContentPanel {

	PythonContentPanelUsages(){
		super();
		rf.writeTitle("Python 활용 사례", this);
		rf.readText("TxtFiles/PythonTxt/python_usages.txt", this);
	}

}
