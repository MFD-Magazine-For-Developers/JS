package contentSec;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class JsTitlePanel extends JPanel  {  //라벨이 가능하면 라벨로, 안되면 패널로.

	public JsTitlePanel(JsMainPanel mp) {

		 setLayout(null);
		 setPreferredSize(new Dimension(1024,100));//BorderLayout에서 Component의 크기 설정
		 setBackground(JsMainPanel.defaultBackgroundColor);

		 JLabel title = new JLabel("I want to be a Developer");
		 title.setFont(new Font("G마켓 산스 TTF", Font.PLAIN, 25));
		 title.setBounds(20, 10, 1024, 50);
		 add(title); //제목

		 JLabel language = new JLabel("JavaScript");
		 language.setFont(new Font("G마켓 산스 TTF", Font.BOLD, 40));
		 language.setBounds(100, 50, 1024, 50); // 상수 해결할 것.. 추후에
		 add(language); //언어

		 mp.add(this,BorderLayout.NORTH);
	}



}
