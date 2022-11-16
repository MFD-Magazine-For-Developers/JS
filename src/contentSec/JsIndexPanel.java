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

		setLayout(null);
		setPreferredSize(new Dimension(150, 668));// BorderLayout에서 Component의 크기 설정
		setBackground(JsMainPanel.defaultBackgroundColor);

		ButtonsWrapper bw = new ButtonsWrapper(this, mp); 
		// 위부터 있던 버튼들을 가운데로 옮겼습니다.
		// ButtonWrapper 클래스를 따로 두어 위치를 정한 후  JsIndexPanel에서 생성해서 보여지게 하는 방식입니다. 
		
		mp.add(this, BorderLayout.WEST);
	}
}
