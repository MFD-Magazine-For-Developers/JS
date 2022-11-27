package templates;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JPanel;


public class Info extends ContentPanel {

	public Info() {
		super();
		
		rf.writeTitle("MFD 소개", this);
		rf.readText("TxtFiles/MFD_introduction.txt", this);
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Info();
	}

}
