package python_main;

import templates.ContentPanel;
import templates.CreateHyperLinkClass;

public class PythonContentPanelLecture extends ContentPanel{

	PythonContentPanelLecture(){
		super();
		rf.writeTitle("추천 강의", this);
//		rf.readText("TxtFiles/PythonTxt/python_lectures.txt", this);
		new CreateHyperLinkClass("생활코딩","https://opentutorials.org/course/4769",this);
		new CreateHyperLinkClass("나도코딩","(https://nadocoding.tistory.com/category/%ED%8C%8C%EC%9D%B4%EC%8D%AC%20%EA%B0%95%EC%9D%98",this);
		new CreateHyperLinkClass("프로그래머스","https://school.programmers.co.kr/",this);
		
	}
	
	
}
