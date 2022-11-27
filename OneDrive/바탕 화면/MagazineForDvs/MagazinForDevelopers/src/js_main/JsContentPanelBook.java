package js_main;

import java.awt.Dimension;
import java.awt.FlowLayout;

import templates.ContentPanel;
import templates.CreateHyperLinkClass;
import templates.MainPanel;
import templates.ReadingFile;

public class JsContentPanelBook extends ContentPanel {

	public JsContentPanelBook() {

		super();
		rf.writeTitle("JS 추천 도서", this);
		new CreateHyperLinkClass("Let’s Get IT 자바스크립트 프로그래밍","https://book.interpark.com/product/BookDisplay.do?_method=detail&sc.saNo=001&sc.prdNo=351458345&saNo=008002003001&product2020=true",this);

	}

}
