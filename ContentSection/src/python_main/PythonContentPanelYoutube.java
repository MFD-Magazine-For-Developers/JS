package python_main;

import templates.ContentPanel;

public class PythonContentPanelYoutube extends ContentPanel {

	PythonContentPanelYoutube(){
		super();
		rf.writeTitle("Python 추천 유튜브 채널", this); // 각 챕터의 이름입니다.
		rf.readText("TxtFiles/PythonTxt/python_youtuber.txt", this);

	}
	
}
