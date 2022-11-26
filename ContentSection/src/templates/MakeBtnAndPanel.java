package templates;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

public class MakeBtnAndPanel { //2. 버튼이랑 버튼에 대응되는 패널을 만들어주는 메서드가 있는 클래스입니다.

	public ArrayList<JButton> btnArr = new ArrayList<>();
	public ArrayList<ContentPanel> cpArr= new ArrayList<>();;
	
	public void method(String title, ContentPanel cp){
		JButton btn = new JButton(title);
		btn.addActionListener(new MyActionListener());
		this.btnArr.add(btn);
		this.cpArr.add(cp);
	}
	
	
	class MyActionListener implements ActionListener { // 버튼 이벤트 리스너
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton) e.getSource();
			int index= 0;
			for(int i = 0; i<btnArr.size(); i++) {
				if(btn == btnArr.get(i)) {
					index = i;
				}
				MainPanel.scrollIndexPanel.setViewportView(cpArr.get(index));
			}
		}
	}
}
