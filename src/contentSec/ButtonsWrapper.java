package contentSec;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class ButtonsWrapper extends JPanel {

	JButton[] btnArr;
	JsIndexPanel jsIndexPanel;
	
	public ButtonsWrapper(JsIndexPanel jsIndexPanel, JsMainPanel mp) {
		
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setBounds(0,100,150,500);
		setBackground(JsMainPanel.defaultBackgroundColor);

		ContentPanelInfo js1 = new ContentPanelInfo();
		ContentPanelChar js2 = new ContentPanelChar();
		ContentPanelIde js3 = new ContentPanelIde();
		ContentPanelDocs js4 = new ContentPanelDocs();
		ContentPanelYoutube js5 = new ContentPanelYoutube();
		ContentPanelLec js6 = new ContentPanelLec();
		ContentPanelBook js7 = new ContentPanelBook();
		
		
		btnArr = new JButton[7];
		btnArr[0] = new JButton("JS 소개");
		btnArr[1] = new JButton("JS 특징");
		btnArr[2] = new JButton("JS 개발 환경");
		btnArr[3] = new JButton("JS 공식문서");
		btnArr[4] = new JButton("JS 추천 유튜브");
		btnArr[5] = new JButton("JS 추천 강의");
		btnArr[6] = new JButton("JS 추천 도서");
		
		
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
		
		Dimension maxSize = new Dimension(117, 30);
		
		for (int i = 0; i < btnArr.length; i++) {
		btnArr[i].setAlignmentX(Component.CENTER_ALIGNMENT);
		btnArr[i].addActionListener(new MyActionListener());
		this.add(Box.createVerticalStrut(20));
		btnArr[i].setMaximumSize(maxSize);
		 add(btnArr[i]);
	}
		setVisible(true);
		jsIndexPanel.add(this);
	}
	
	
}
