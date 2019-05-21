package calculator;

import java.awt.event.KeyListener;

public class KeyEvent implements KeyListener {
	
	Calculator view;
	

	
	public KeyEvent(Calculator cal) {
		view = cal;
	}

	@Override
	public void keyPressed(java.awt.event.KeyEvent e) {
		// TODO Auto-generated method stub
		
		char key = e.getKeyChar();
				
		if(view.step == 0 && key == 10) {
			view.firstNum = view.inputArea.getText();
			view.explain.setText(view.inputArea.getText());
			view.inputArea.setText("");
			view.step = 1; 
		}else if( view.step == 1 && key ==10 ) {
			view.operation = view.inputArea.getText();
			view.explain.setText(view.firstNum + view.inputArea.getText());
			view.inputArea.setText("");
			view.step = 2;
		}else if(view.step == 2 && key == 10) {
			view.secondNum = view.inputArea.getText();
			view.explain.setText(view.firstNum + view.operation + view.inputArea.getText());
			view.inputArea.setText("");
			view.step = 3;
		}
		
		if(view.step == 3) {
			if(view.operation.equals("+")) {
				view.result = Integer.parseInt(view.firstNum) + Integer.parseInt(view.secondNum);
			}else if(view.operation.equals("-")) {
				view.result = Integer.parseInt(view.firstNum) + Integer.parseInt(view.secondNum);
			}else if(view.operation.equals("*")) {
				view.result = Integer.parseInt(view.firstNum) * Integer.parseInt(view.secondNum);
			}else if(view.operation.equals("/")) {
				view.result = Integer.parseInt(view.firstNum) / Integer.parseInt(view.secondNum);
			}
			view.explain.setText(Double.toString(view.result));
		}
	}

	@Override
	public void keyReleased(java.awt.event.KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(java.awt.event.KeyEvent e) {
		// TODO Auto-generated method stub
		char key = e.getKeyChar();
		
		// 단계별 입력 제한
		if((view.step == 1) && (key == 42 || key == 43 || key == 45 || key == 47 || key == 61 || key == 10)) {
			System.out.println("1");
		}else if((view.step == 0 || view.step == 2) && !Character.isDigit(key)) {
			System.out.println("2");
			e.consume(); return;
		}else if(view.step == 1) {
			System.out.println("3");
			e.consume(); return;
		}
	}

}
