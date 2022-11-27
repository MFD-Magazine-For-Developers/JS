package templates;

import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public abstract class AbstractButtonsWrapper extends JPanel  {
	protected Dimension maxSize;
	
	public AbstractButtonsWrapper() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setBounds(0, 100, 150, 500);
		setBackground(MainPanel.defaultBackgroundColor);
		 maxSize = new Dimension(117, 30);
	}
	
	
}
