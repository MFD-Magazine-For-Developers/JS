package java_main;

import java.awt.Dimension;
import java.awt.FlowLayout;

import templates.ContentPanel;
import templates.CreateHyperLinkClass;
import templates.MainPanel;
import templates.ReadingFile;

public class JContentPanelDoc extends ContentPanel {

	public JContentPanelDoc() {
		super();
		rf.writeTitle("Java 공식 문서", this); // 각 챕터의 이름입니다.
		new CreateHyperLinkClass("공식 문서 ","https://docs.oracle.com/javase/specs/jls/se8/html/index.html",this);
		new CreateHyperLinkClass("자바 홈페이지","https://docs.oracle.com/en/java/javase/19/",this);
		new CreateHyperLinkClass("자바 기본 제공 라이브러리 ","https://docs.oracle.com/javase/8/docs/api",this);	}

}
