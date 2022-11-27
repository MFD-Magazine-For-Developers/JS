package templates;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import js_main.JsButtonsWrapper;
import js_main.JsContentPanelInfo;
import main.newMainView;

public class TitlePanel extends JPanel {
	
	ImageIcon imageIcon = new ImageIcon(new ImageIcon("images/mainImage.gif").getImage().getScaledInstance(110, 110, Image.SCALE_DEFAULT));

	public TitlePanel(MainPanel mp, String languageName) {

		setLayout(null);
		setPreferredSize(new Dimension(1024, 150));// title panel의 크기입니다.
		setBackground(MainPanel.defaultBackgroundColor);

		JLabel language = new JLabel(languageName,SwingConstants.CENTER);
		language.setFont(new Font("G마켓 산스 TTF", Font.BOLD, 40));
		language.setSize(230, 50);
		language.setLocation(this.getPreferredSize().width / 2 - language.getWidth() / 2, 50);
		add(language); // 언어
		
		JButton mainBtn = new JButton();
		mainBtn.setIcon(imageIcon);
		mainBtn.setBounds(30, 20, imageIcon.getIconWidth(), imageIcon.getIconHeight());
		add(mainBtn);
		
		
		mainBtn.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		mp.dispose(); //현재 윈도우만 닫힘
        		//setVisible(false);
        		new newMainView();
        	}
        });

		mp.add(this, BorderLayout.NORTH);
	}

}
