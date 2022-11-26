package templates;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class IndexPanel extends JPanel {

	AbstractButtonsWrapper bw;
	public IndexPanel(MainPanel mp, AbstractButtonsWrapper abw) {

		setLayout(null);
		setPreferredSize(new Dimension(150, 668));// BorderLayout에서 Component의 크기 설정
		setBackground(MainPanel.defaultBackgroundColor);

		bw = abw; 
		// 위부터 있던 버튼들을 가운데로 옮겼습니다.
		// ButtonWrapper 클래스를 따로 두어 위치를 정한 후  JsIndexPanel에서 생성해서 보여지게 하는 방식입니다. 
		add(bw);
		
		
		mp.add(this, BorderLayout.WEST);
	}
}

