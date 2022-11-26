package python_main;

import templates.ContentPanel;
import templates.CreateHyperLinkClass;

public class PythonContentPanelDoc extends ContentPanel{

	PythonContentPanelDoc(){
		super();
		rf.writeTitle("공식문서 및 홈페이지", this);
		new CreateHyperLinkClass("공식문서","https://docs.python.org/ko/3/",this);
		new CreateHyperLinkClass("공식문서 사용법","https://opentutorials.org/course/3256/19845",this);
		new CreateHyperLinkClass("공식 홈페이지","https://www.python.org/",this);
	}
	
	
}