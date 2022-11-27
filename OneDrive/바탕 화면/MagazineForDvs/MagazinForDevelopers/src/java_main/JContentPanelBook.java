package java_main;

import templates.ContentPanel;
import templates.CreateHyperLinkClass;

public class JContentPanelBook extends ContentPanel {

	public JContentPanelBook() {

		super();
		rf.writeTitle("Java 추천 도서", this);
		new CreateHyperLinkClass("명품JAVA Programming","https://product.kyobobook.co.kr/detail/S000001076326",this);
		new CreateHyperLinkClass("자바의 정석","https://product.kyobobook.co.kr/detail/S000001550352",this);
		new CreateHyperLinkClass("Do it! 자바 완전 정복","https://product.kyobobook.co.kr/detail/S000001818032",this);
		new CreateHyperLinkClass("JAVA 객체지향 디자인 패턴","https://product.kyobobook.co.kr/detail/S000001057516",this);
	}
	
	
}
