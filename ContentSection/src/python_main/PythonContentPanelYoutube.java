package python_main;

import templates.ContentPanel;
import templates.CreateHyperLinkClass;

public class PythonContentPanelYoutube extends ContentPanel {

	PythonContentPanelYoutube(){
		super();
		rf.writeTitle("Python 추천 유튜브 채널", this); // 각 챕터의 이름입니다.
//		rf.readText("TxtFiles/PythonTxt/python_youtuber.txt", this);
		new CreateHyperLinkClass("생활코딩","https://www.youtube.com/playlist?list=PLuHgQVnccGMDtnr4nTSFfmocHL5FeH1xR",this );
		new CreateHyperLinkClass("나도코딩","https://www.youtube.com/channel/UC7iAOLiALt2rtMVAWWl4pnw",this );
		new CreateHyperLinkClass("김왼손의 왼손코딩","https://youtu.be/UrwFkNRzzT4",this );
		
	}
	
}
