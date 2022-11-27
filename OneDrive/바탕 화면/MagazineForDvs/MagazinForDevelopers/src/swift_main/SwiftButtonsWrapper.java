package swift_main;

import java.awt.Component;

import javax.swing.Box;

import templates.AbstractButtonsWrapper;
import templates.IndexPanel;
import templates.MakeBtnAndPanel;

public class SwiftButtonsWrapper extends AbstractButtonsWrapper {

	IndexPanel IndexPanel;

	public SwiftButtonsWrapper(){
		
		super();
		MakeBtnAndPanel mbap = new MakeBtnAndPanel();  //3. 버튼이랑 패널 객체를 생성하고 
		
		mbap.method("소개", new SwContentPanelInfo()); //4. 인자로 버튼이름과 버튼을 누르면 나타날 패널을 넣어줍니다. 
		mbap.method("특징", new SwContentPanelChar());
		mbap.method("개발 환경", new SwContentPanelIde());
		mbap.method("공식 문서", new SwContentPanelDoc());
		mbap.method("추천 유튜브", new SwContentPanelYoutube());
		mbap.method("추천 강의", new SwContentPanelLecture());
		mbap.method("추천 도서", new SwContentPanelBook());
		mbap.method("프로젝트", new SwContentPanelProject());
		
		for (int i = 0; i < mbap.btnArr.size(); i++) { // 버튼을 화면에 그려주는 부분입니다.
			mbap.btnArr.get(i).setAlignmentX(Component.CENTER_ALIGNMENT);
			this.add(Box.createVerticalStrut(20));
			mbap.btnArr.get(i).setMaximumSize(super.maxSize);
			add(mbap.btnArr.get(i));
		}
		setVisible(true);
	}
	
	
}
