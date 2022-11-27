package js_main;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import templates.AbstractButtonsWrapper;
import templates.IndexPanel;
import templates.MakeBtnAndPanel;

public class JsButtonsWrapper extends AbstractButtonsWrapper {// 1. 인덱스 패널 안에 따로 버튼두는 패널을 두었습니다. 

	IndexPanel IndexPanel;

	public JsButtonsWrapper() { 
		
		super();
		MakeBtnAndPanel mbap = new MakeBtnAndPanel();  //3. 버튼이랑 패널 객체를 생성하고 
		
		mbap.method("소개", new JsContentPanelInfo()); //4. 인자로 버튼이름과 버튼을 누르면 나타날 패널을 넣어줍니다. 
		mbap.method("특징", new JsContentPanelChar()); //다른 곳은 다 그대로 두고 여기 추가만 해주시면 됩니다.
		mbap.method("개발 환경", new JsContentPanelIde());
		mbap.method("공식 문서", new JsContentPanelDoc());
		mbap.method("추천 유튜브", new JsContentPanelYoutube());
		mbap.method("추천 강의", new JsContentPanelLecture());
		mbap.method("추천 도서", new JsContentPanelBook());
		mbap.method("사용 예제", new JsContentPanelUsages());
		
		for (int i = 0; i < mbap.btnArr.size(); i++) { // 버튼을 화면에 그려주는 부분입니다.
			mbap.btnArr.get(i).setAlignmentX(Component.CENTER_ALIGNMENT);
			this.add(Box.createVerticalStrut(20));
			mbap.btnArr.get(i).setMaximumSize(super.maxSize);
			add(mbap.btnArr.get(i));
		}
		setVisible(true);
	}

}
