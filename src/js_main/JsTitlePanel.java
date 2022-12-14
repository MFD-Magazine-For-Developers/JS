package js_main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JsTitlePanel extends JPanel {

	JLabel imageLabel = new JLabel();

	public JsTitlePanel(JsMainPanel mp, String languageName) {

		setLayout(null);
		setPreferredSize(new Dimension(1024, 150));// title panel의 크기입니다.
		setBackground(JsMainPanel.defaultBackgroundColor);

		JLabel language = new JLabel(languageName);
		language.setFont(new Font("G마켓 산스 TTF", Font.BOLD, 40));
		language.setSize(230, 50);
		language.setLocation(this.getPreferredSize().width / 2 - language.getWidth() / 2, 50);
		add(language); // 언어

		ImageIcon imageIcon = new ImageIcon(
				new ImageIcon("imges/300mainImage.gif").getImage().getScaledInstance(110, 110, Image.SCALE_DEFAULT));
		imageLabel.setIcon(imageIcon); // 일단 넣어 봤는데 상단 이미지 누르면 메인 화면으로 돌아가게끔 하는 건 어떨까요?
		imageLabel.setBounds(30, 20, imageIcon.getIconWidth(), imageIcon.getIconHeight());
		add(imageLabel);

		mp.add(this, BorderLayout.NORTH);
	}
}
