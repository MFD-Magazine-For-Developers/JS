package templates;

import java.awt.Dimension;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ReadingFile { 
	// 각 챕터(Swift의 특징, Swift의 개발환경 이런..)별로 txt파일로 나눠서 하는 방식인데요
	//세개의 메서드가 있습니다.
	//txt파일들로 만들어서 이클립스에서 import해서 사용해야 해요.
	
	public void readText(String fileInput,ContentPanel cp) { //txt파일 읽는 메서드입니다.
		// ReadingFile 객체 만들고  ex) ReadingFile rf = new ReadingFile();
		// rf.readText("txt파일 경로", this); 해주시면 텍스트가 창에 나와요. 
		
		File file = new File(fileInput);

		BufferedReader br;
		String result = "";
		
		try {
			FileReader reader = new FileReader(file);
			br = new BufferedReader(reader);
			String line = "";
			
			while((line = br.readLine()) != null) {
				result += line + "\n";
			}
		}catch(Exception e) {}
		
//		if(isHyperLink) {
//			
//			result.
//			
//		}
		
		result = "<html><pre>" + result + "</pre></html>";
		
		
		
		
		
		JLabel contentLabel = new JLabel(result);
		contentLabel.setFont(cp.defaultTextFont);
		contentLabel.setMaximumSize(new Dimension(cp.defaultContentWidth,cp.defaultContentHeight));
		cp.add(contentLabel);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	public void readImage(String imgFile,int width,int height,ContentPanel cp) {
		// 이건 이미지 읽는 메서드인데 js만 이미지가 들어가서 다른 곳에는 사용할 일이 없을 것 같아요.
		
		ImageIcon intro_html_img = new ImageIcon(new ImageIcon(imgFile).getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
		JLabel intro_html_label = new JLabel(intro_html_img);
		cp.add(intro_html_label);
		
	}
	
	
	public void writeTitle(String title, ContentPanel cp) {
	// 각 챕터 글자 크기 설정해주는 메서드입니다.
	// 챕터 글자 크기(ex) Js소개, Js의 특징..)는 좀 커서 챕터 만드는 메서드 따로 만들었습니다. 
	//읽는거하고 관련없지만 따로 객체로 만들기는 낭비인 것 같아 그냥 이 클래스에 넣었습니다..
		
		JLabel sectionTitleLabel = new JLabel("<html>"+ title + "</html>"); // JLabel의 컨텐츠를 각자 바꿔주시면 됩니다.
		sectionTitleLabel.setFont(cp.defaultTitleFont);
		sectionTitleLabel.setSize(cp.defaultTitleWidth, cp.defaultTitleHeight);
		cp.add(sectionTitleLabel);	
	}
}
