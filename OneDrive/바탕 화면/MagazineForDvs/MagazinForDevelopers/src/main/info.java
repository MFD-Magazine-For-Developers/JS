package main;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import templates.ReadingFile;

public class info extends JFrame{
	
	Color mainYellow = Color.decode("#FFEB94");
    Color mainOrange = Color.decode("#FD9F28");
    Container container;
    
	public info() {
		
		setTitle("About MFD");
		setVisible(true);
		// 잡지 규격에 맞춤. (약간씩만 늘림.)
        this.setSize(736,950);
        // 모니터 가운데 배치
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int xpos = (int)(screen.getWidth()/2 - super.getWidth()/2);
        int ypos = (int)(screen.getHeight()/2 - super.getHeight()/2);
        setLocation(xpos, ypos);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		container = getContentPane();
        container.setBackground(mainYellow);
        setLayout(new FlowLayout(FlowLayout.LEFT,110,30));
     
        
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("images/mainImage.gif").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT));
    	JLabel mainBtn = new JLabel();
		mainBtn.setIcon(imageIcon); 
		add(mainBtn);

		mainBtn.addMouseMotionListener(new MouseMotionAdapter() {
	        //override the method // 누르고 살짝 드래그 할 경우 메인 뷰로 넘어갑니다.
	        public void mouseDragged(MouseEvent arg0) {
	        	dispose();
	        	new newMainView();
	        }
	    });
		
        ReadingFile rf = new ReadingFile();
        rf.writeTitle("MFD 소개", this);
        rf.readText("TxtFiles/MFD_introduction.txt",this );
	}
	
	public static void main(String[] args) {
        new info();
	}
}