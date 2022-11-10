package contentSec;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class JsIndexPanel extends JPanel {

	public JsIndexPanel(JsMainPanel mp) {

		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setPreferredSize(new Dimension(150, 668));// BorderLayout에서 Component의 크기 설정
		setBackground(JsMainPanel.defaultBackgroundColor);

		ContentPanelInfo js1 = new ContentPanelInfo();
		ContentPanelChar js2 = new ContentPanelChar();
		ContentPanelIde js3 = new ContentPanelIde();
		ContentPanelDocs js4 = new ContentPanelDocs();
		ContentPanelYoutube js5 = new ContentPanelYoutube();
		ContentPanelLec js6 = new ContentPanelLec();
		ContentPanelBook js7 = new ContentPanelBook();

		class MyActionListener implements ActionListener { // 버튼 이벤트 리스너
			@Override
			public void actionPerformed(ActionEvent e) {

				JButton btn = (JButton) e.getSource();
				String textInBtn = btn.getText();

				if (textInBtn.equals("JS 소개")) { // 일단은 버튼 이름에 따라서 화면이 나오는 화면이 결정되게끔 했습니다.
					JsMainPanel.scrollIndexPanel.setViewportView(js1);
				} else if (textInBtn.equals("JS 특징")) {
					JsMainPanel.scrollIndexPanel.setViewportView(js2);
				} else if (textInBtn.equals("JS 개발 환경")) {
					JsMainPanel.scrollIndexPanel.setViewportView(js3);
				} else if (textInBtn.equals("JS 공식문서")) {
					JsMainPanel.scrollIndexPanel.setViewportView(js4);
				} else if (textInBtn.equals("JS 추천 유튜브")) {
					JsMainPanel.scrollIndexPanel.setViewportView(js5);
				} else if (textInBtn.equals("JS 추천 강의")) {
					JsMainPanel.scrollIndexPanel.setViewportView(js6);
				} else if (textInBtn.equals("JS 추천 도서")) {
					JsMainPanel.scrollIndexPanel.setViewportView(js7);
				}
				mp.validate();
				mp.repaint();
			}
		}

		JButton[] btnArr = new JButton[7];
		btnArr[0] = new JButton("JS 소개");
		btnArr[1] = new JButton("JS 특징");
		btnArr[2] = new JButton("JS 개발 환경");
		btnArr[3] = new JButton("JS 공식문서");
		btnArr[4] = new JButton("JS 추천 유튜브");
		btnArr[5] = new JButton("JS 추천 강의");
		btnArr[6] = new JButton("JS 추천 도서");

		for (int i = 0; i < btnArr.length; i++) {
			btnArr[i].setAlignmentX(Component.CENTER_ALIGNMENT);
			btnArr[i].addActionListener(new MyActionListener());
			this.add(Box.createVerticalStrut(10));
			add(btnArr[i]);
		}

		mp.add(this, BorderLayout.WEST);
	}
}
