package swift_main;

import templates.ContentPanel;
import templates.CreateHyperLinkClass;

public class SwContentPanelBook extends ContentPanel {

	public SwContentPanelBook(){
		super();
		rf.writeTitle("Swift 추천 도서", this);
		new CreateHyperLinkClass("핵심만 골라 배우는 SwiftUI 기반의 iOS 프로그래밍","https://product.kyobobook.co.kr/detail/S000001942488",this);
		new CreateHyperLinkClass("스위프트 프로그래밍: Swift 5","https://product.kyobobook.co.kr/detail/S000001810190",this);
		new CreateHyperLinkClass("Do it! 스위프트로 아이폰 앱 만들기 입문","https://product.kyobobook.co.kr/detail/S000001818056",this);
		
	}
	
}
