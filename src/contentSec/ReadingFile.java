package contentSec;

import java.awt.Dimension;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ReadingFile {

	public void readText(String fileInput, ContentPanel cp) {

		File file = new File(fileInput);

		BufferedReader br;
		String result = "";

		try {
			FileReader reader = new FileReader(file);
			br = new BufferedReader(reader);
			String line = "";

			while ((line = br.readLine()) != null) {
				result += line + "\n";
			}
		} catch (Exception e) {
		}

		result = "<html><pre>" + result + "</pre></html>";

		JLabel contentLabel = new JLabel(result);
		contentLabel.setFont(cp.defaultTextFont);
		contentLabel.setMaximumSize(new Dimension(cp.defaultContentWidth, cp.defaultContentHeight));
		cp.add(contentLabel);

	}

	public void readImage(String imgFile, int width, int height, ContentPanel cp) {

		ImageIcon intro_html_img = new ImageIcon(
				new ImageIcon(imgFile).getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
		JLabel intro_html_label = new JLabel(intro_html_img);
		cp.add(intro_html_label);

	}

	public void writeTitle(String title, ContentPanel cp) {
		// 각 챕터 글자 크기 설정해주는 메서드입니다.
		// 읽는거하고 관련없지만 따로 객체로 만들기는 낭비인 것 같아 그냥 이 클래스에 넣었습니다..

		JLabel sectionTitleLabel = new JLabel("<html>" + title + "</html>"); // JLabel의 컨텐츠를 각자 바꿔주시면 됩니다.
		sectionTitleLabel.setFont(cp.defaultTitleFont);
		sectionTitleLabel.setSize(cp.defaultTitleWidth, cp.defaultTitleHeight);
		cp.add(sectionTitleLabel);

	}

}
