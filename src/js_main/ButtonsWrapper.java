package js_main;

import java.awt.Component;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class ButtonsWrapper extends JPanel {

	JsIndexPanel jsIndexPanel;

	public ButtonsWrapper(JsIndexPanel jsIndexPanel, JsMainPanel mp) {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setBounds(0, 100, 150, 500);
		setBackground(JsMainPanel.defaultBackgroundColor);
		Dimension maxSize = new Dimension(117, 30);

		MakeBtnAndPanel mbap = new MakeBtnAndPanel(); // 3. 버튼이랑 패널 객체를 생성하고

		mbap.method("JS 소개", new ContentPanelInfo()); // 4. 인자로 버튼이름과 버튼을 누르면 나타날 패널을 넣어줍니다.
		mbap.method("JS 특징", new ContentPanelChar()); // 다른 곳은 다 그대로 두고 여기 추가만 해주시면 됩니다.
		mbap.method("JS 개발 환경", new ContentPanelIde());
		mbap.method("JS 공식 문서", new ContentPanelDocs());
		mbap.method("JS 추천 유튜브", new ContentPanelYoutube());
		mbap.method("JS 추천 강의", new ContentPanelLecture());
		mbap.method("JS 추천 도서", new ContentPanelBook());

		for (int i = 0; i < mbap.btnArr.size(); i++) { // 버튼을 화면에 그려주는 부분입니다.
			mbap.btnArr.get(i).setAlignmentX(Component.CENTER_ALIGNMENT);
			this.add(Box.createVerticalStrut(20));
			mbap.btnArr.get(i).setMaximumSize(maxSize);
			add(mbap.btnArr.get(i));
		}
		setVisible(true);
		jsIndexPanel.add(this);
	}
}
