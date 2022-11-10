package contentSec;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class JsMainPanel extends JFrame { // 추후 작성할 것

	public static JScrollPane scrollIndexPanel;
	public static Color defaultBackgroundColor = new Color(0x00FD9F28);
	public static Color defaultContentColor = new Color(253, 159, 40);

	public JsMainPanel() {

		setTitle("Content Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		c.setBackground(defaultBackgroundColor);

		// 제목 라벨
		JsTitlePanel tp = new JsTitlePanel(this);
		JsIndexPanel ip = new JsIndexPanel(this);
		scrollIndexPanel = new JScrollPane(new ContentPanelInfo(), JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		add(scrollIndexPanel, BorderLayout.CENTER);

		JPanel emptySpace = new JPanel();
		emptySpace.setPreferredSize(new Dimension(10, 768));
		emptySpace.setBackground(defaultBackgroundColor);
		add(emptySpace, BorderLayout.EAST); // 여백공간..

		setSize(1024, 768);
		setVisible(true);
	}

	public static void main(String[] args) {

		new JsMainPanel();

	}

}
