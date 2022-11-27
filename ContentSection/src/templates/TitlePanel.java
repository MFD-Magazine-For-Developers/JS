package templates;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class TitlePanel extends JPanel {

	JLabel imageLabel = new JLabel();

	public TitlePanel(MainPanel mp, String languageName) {

		setLayout(null);
		setPreferredSize(new Dimension(1024, 150));// title panel의 크기입니다.
		setBackground(MainPanel.defaultBackgroundColor);

		JLabel language = new JLabel(languageName,SwingConstants.CENTER);
		language.setFont(new Font("G마켓 산스 TTF", Font.BOLD, 40));
		language.setSize(230, 50);
		language.setLocation(this.getPreferredSize().width / 2 - language.getWidth() / 2, 50);
		add(language); // 언어

		ImageIcon imageIcon = new ImageIcon(
				new ImageIcon("imges/300mainImage.gif").getImage().getScaledInstance(110, 110, Image.SCALE_DEFAULT));
		imageLabel.setIcon(imageIcon); 
		
		// 우측 상단 이미지 입니다. 클릭하면 매인뷰로 이동합니다.
		imageLabel.addMouseMotionListener(new MouseMotionAdapter() {
	        //override the method
	        public void mouseDragged(MouseEvent arg0) {
	        	mp.dispose();// 아이콘을 클릭하면 메인 패널이 닫힙니다. 
	        	// new 메인 뷰   // 메인뷰 객체를 생성합니다.
	        	// 메인뷰.setVisible(true):
	        }
	    });
		
		imageLabel.setBounds(30, 20, imageIcon.getIconWidth(), imageIcon.getIconHeight());
		add(imageLabel);
		mp.add(this, BorderLayout.NORTH);
	}

}
