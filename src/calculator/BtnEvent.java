package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtnEvent implements ActionListener {
	
	Calculator view;
	KeyEvent ke;

	public BtnEvent(Calculator cal) {
		view = cal;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String str = e.getActionCommand();
		System.out.println(str);
		switch(str) {
			case "C" :
				view.inputArea.setText("");
				view.explain.setText("...");
				view.step = 0;
				view.firstNum = "";
				view.operation = "";
				view.secondNum = "";
				view.result = 0;
				view.inputArea.requestFocus();
				break;
				
			case "CE" :
				view.inputArea.setText("");
				view.inputArea.requestFocus();
				break;
		}
	}

}
