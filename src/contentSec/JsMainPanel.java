package contentSec;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class JsMainPanel extends JFrame { // 추후 작성할 것

	public static JScrollPane scrollIndexPanel;
	public static Color defaultBackgroundColor = new Color(255, 235, 148);
	public static Color defaultContentColor = new Color(253, 159, 40);

	public JsMainPanel() {

		setTitle("Content Page");

		setSize(1024, 768);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();

		c.setLayout(new BorderLayout());
		c.setBackground(defaultBackgroundColor);

		// 제목 라벨
		JsTitlePanel tp = new JsTitlePanel(this);
		JsIndexPanel ip = new JsIndexPanel(this);
		scrollIndexPanel = new JScrollPane(new ContentPanelInfo(), JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		add(scrollIndexPanel, BorderLayout.CENTER);

		JPanel emptySpace = new JPanel();
		emptySpace.setPreferredSize(new Dimension(10, 768));
		emptySpace.setBackground(defaultBackgroundColor);
		add(emptySpace, BorderLayout.EAST); // 여백공간..

		setVisible(true);
	}

	public static void main(String[] args) throws IOException {

		new JsMainPanel();

	}

}
