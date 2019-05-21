package calculator;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Calculator extends JFrame {
	
	public AppStart as;
	
	public int step = 0;
	public String firstNum = "";
	public String operation = "";
	public String secondNum = "";
	public double result = 0;
	
	public JPanel mainPanel;
	public JLabel explain;
	public JTextField inputArea;
	public JButton resetBtn;
	public JButton zeroBtn;
	
	public Calculator(AppStart as) {
		this.as = as;
		init();
	}
	
	public void init() {
		
		mainPanel = new JPanel();
		mainPanel.setBorder(new TitledBorder("Calculator"));
		mainPanel.setLayout(new BorderLayout());
		
		setContentPane(mainPanel);
		
		inputArea = new JTextField();
		
		explain = new JLabel("...", JLabel.RIGHT);
		explain.setBorder(new TitledBorder("Result"));
		
		resetBtn = new JButton("C");
		zeroBtn = new JButton("CE");
		
		mainPanel.add(inputArea, BorderLayout.NORTH);
		mainPanel.add(explain, BorderLayout.CENTER);
		mainPanel.add(resetBtn, BorderLayout.EAST);
		mainPanel.add(zeroBtn, BorderLayout.WEST);
		
		inputArea.addKeyListener(new calculator.KeyEvent(this));
		
		resetBtn.addActionListener(new BtnEvent(this));
		zeroBtn.addActionListener(new BtnEvent(this));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setTitle("Calculator");
		setSize(300, 200);
		setLocationRelativeTo(null);	// 창을 가운데로
		setVisible(true);
	}
	
}
