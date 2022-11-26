package python_main;

import templates.ContentPanel;
import templates.CreateHyperLinkClass;

public class PythonContentPanelBook extends ContentPanel{

	PythonContentPanelBook(){
		super();
		rf.writeTitle("추천 도서", this);
		new CreateHyperLinkClass("혼자 공부하는 파이썬","https://product.kyobobook.co.kr/detail/S000061352349",this);
		new CreateHyperLinkClass("Do it! 점프 투 파이썬","https://product.kyobobook.co.kr/detail/S000001817933",this);
		new CreateHyperLinkClass("밑바닥부터 시작하는 딥러닝","https://product.kyobobook.co.kr/detail/S000001057805?LINK=NVB",this);
	
	}
	
	
}