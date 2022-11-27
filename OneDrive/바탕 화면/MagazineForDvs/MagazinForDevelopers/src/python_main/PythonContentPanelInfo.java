package python_main;

import java.awt.Dimension;
import java.awt.FlowLayout;

import templates.ContentPanel;
import templates.MainPanel;
import templates.ReadingFile;

public class PythonContentPanelInfo extends ContentPanel {

	public PythonContentPanelInfo(){
		super();
		rf.writeTitle("Python소개", this); // 각 챕터의 이름입니다.
		rf.readText("TxtFiles/PythonTxt/python_intro.txt", this);

	}
}
