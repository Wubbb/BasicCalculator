package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private JTextField calcScreen;
	private JButton btnClear;
	private JButton btnModulus;
	private JButton btnPlus;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btnMinus;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btnMult;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btnDivide;
	private JButton btnZero;
	private JButton btnDot;
	private JButton btnPlusMinus;
	private JButton btnEquals;
	private Double firstNum;
	private String operation;
	private Double secondNum;
	private Double result;
	private String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 519, 622);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		//================Calculators Screen===================
		calcScreen = new JTextField();
		calcScreen.setFont(new Font("Dialog", Font.PLAIN, 70));
		calcScreen.setBounds(0, 0, 504, 84);
		frame.getContentPane().add(calcScreen);
		calcScreen.setColumns(10);
		
		//================ROW1===================
		JButton btnBackspace = new JButton("\u232B");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(calcScreen.getText().length() > 0) {
					String backspace = null;
					StringBuilder stringB = new StringBuilder(calcScreen.getText());
					stringB.deleteCharAt(calcScreen.getText().length()-1);
					backspace =stringB.toString();
					calcScreen.setText(backspace);
				}
			}
		});
		btnBackspace.setFont(new Font("Dialog", Font.BOLD, 40));
		btnBackspace.setBounds(0, 85, 117, 84);
		frame.getContentPane().add(btnBackspace);
		
		btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				calcScreen.setText(null);
			}
		});
		btnClear.setFont(new Font("Dialog", Font.BOLD, 60));
		btnClear.setBounds(129, 85, 117, 84);
		frame.getContentPane().add(btnClear);
		
		btnModulus = new JButton("%");
		btnModulus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setOperation("%");
			}
		});
		btnModulus.setFont(new Font("Dialog", Font.BOLD, 60));
		btnModulus.setBounds(258, 85, 117, 84);
		frame.getContentPane().add(btnModulus);
		
		btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setOperation("+");
				
			}
		});
		btnPlus.setFont(new Font("Dialog", Font.BOLD, 60));
		btnPlus.setBounds(387, 85, 117, 84);
		frame.getContentPane().add(btnPlus);
		
		
		//================ROW2===================
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enteredValue = calcScreen.getText() + btn7.getText();
				calcScreen.setText(enteredValue);
			}
		});
		btn7.setFont(new Font("Dialog", Font.BOLD, 60));
		btn7.setBounds(0, 185, 117, 84);
		frame.getContentPane().add(btn7);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enteredValue = calcScreen.getText() + btn8.getText();
				calcScreen.setText(enteredValue);
			}
		});
		btn8.setFont(new Font("Dialog", Font.BOLD, 60));
		btn8.setBounds(129, 185, 117, 84);
		frame.getContentPane().add(btn8);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enteredValue = calcScreen.getText() + btn9.getText();
				calcScreen.setText(enteredValue);
			}
		});
		btn9.setFont(new Font("Dialog", Font.BOLD, 60));
		btn9.setBounds(258, 185, 117, 84);
		frame.getContentPane().add(btn9);
		
		btnMinus = new JButton("-");
		btnMinus.setFont(new Font("Dialog", Font.BOLD, 60));
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setOperation("-");
				
			}
		});
		btnMinus.setBounds(387, 185, 117, 84);
		frame.getContentPane().add(btnMinus);
		
		//================ROW3===================
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enteredValue = calcScreen.getText() + btn4.getText();
				calcScreen.setText(enteredValue);
			}
		});
		btn4.setFont(new Font("Dialog", Font.BOLD, 60));
		btn4.setBounds(0, 281, 117, 84);
		frame.getContentPane().add(btn4);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enteredValue = calcScreen.getText() + btn5.getText();
				calcScreen.setText(enteredValue);
			}
		});
		btn5.setFont(new Font("Dialog", Font.BOLD, 60));
		btn5.setBounds(129, 281, 117, 84);
		frame.getContentPane().add(btn5);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enteredValue = calcScreen.getText() + btn6.getText();
				calcScreen.setText(enteredValue);
			}
		});
		btn6.setFont(new Font("Dialog", Font.BOLD, 60));
		btn6.setBounds(258, 281, 117, 84);
		frame.getContentPane().add(btn6);
		
		btnMult = new JButton("X");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setOperation("X");
			}
		});
		btnMult.setFont(new Font("Dialog", Font.BOLD, 60));
		btnMult.setBounds(387, 281, 117, 84);
		frame.getContentPane().add(btnMult);
		
		
		//================ROW4===================
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enteredValue = calcScreen.getText() + btn1.getText();
				calcScreen.setText(enteredValue);
			}
		});
		btn1.setFont(new Font("Dialog", Font.BOLD, 60));
		btn1.setBounds(0, 383, 117, 84);
		frame.getContentPane().add(btn1);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enteredValue = calcScreen.getText() + btn2.getText();
				calcScreen.setText(enteredValue);
			}
		});
		btn2.setFont(new Font("Dialog", Font.BOLD, 60));
		btn2.setBounds(129, 383, 117, 84);
		frame.getContentPane().add(btn2);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enteredValue = calcScreen.getText() + btn3.getText();
				calcScreen.setText(enteredValue);
			}
		});
		btn3.setFont(new Font("Dialog", Font.BOLD, 60));
		btn3.setBounds(258, 383, 117, 84);
		frame.getContentPane().add(btn3);
		
		btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setOperation("/");
				
			}
		});
		btnDivide.setFont(new Font("Dialog", Font.BOLD, 60));
		btnDivide.setBounds(387, 383, 117, 84);
		frame.getContentPane().add(btnDivide);
		
		
		//================ROW5===================
		btnZero = new JButton("0");
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enteredValue = calcScreen.getText() + btnZero.getText();
				calcScreen.setText(enteredValue);
			}
		});
		btnZero.setFont(new Font("Dialog", Font.BOLD, 60));
		btnZero.setBounds(0, 494, 117, 84);
		frame.getContentPane().add(btnZero);
		
		btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enteredValue = calcScreen.getText() + btnDot.getText();
				calcScreen.setText(enteredValue);
			}
		});
		btnDot.setFont(new Font("Dialog", Font.BOLD, 60));
		btnDot.setBounds(129, 494, 117, 84);
		frame.getContentPane().add(btnDot);
		
		btnPlusMinus = new JButton("\u00B1");
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				double plusminus = Double.parseDouble(String.valueOf(calcScreen.getText()));
		
				plusminus = plusminus*(-1);
				calcScreen.setText(String.valueOf(plusminus));
			}
		});
		btnPlusMinus.setFont(new Font("Dialog", Font.BOLD, 51));
		btnPlusMinus.setBounds(258, 494, 117, 84);
		frame.getContentPane().add(btnPlusMinus);
		
		btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				secondNum = Double.parseDouble(calcScreen.getText());
				
				if(operation == "+") {
					add(firstNum,secondNum);
				} else if(operation == "-") {
					subtract(firstNum,secondNum);
				} else if(operation == "X") {
					multiply(firstNum,secondNum);
				}else if(operation == "/") {
					divide(firstNum,secondNum);
				}else if(operation == "%") {
					modulus(firstNum,secondNum);
				}
			}
		});
		btnEquals.setFont(new Font("Dialog", Font.BOLD, 60));
		btnEquals.setBounds(387, 494, 117, 84);
		frame.getContentPane().add(btnEquals);
	}
	
	public void add(double firstNum,double secondNum) {
		result = firstNum+secondNum;
		answer = String.format("%.2f", result);
		calcScreen.setText(answer);
	}
	
	public void multiply(double firstNum,double secondNum) {
		result = firstNum*secondNum;
		answer = String.format("%.2f", result);
		calcScreen.setText(answer);
	}
	
	public void divide(double firstNum,double secondNum) {
		result = firstNum/secondNum;
		answer = String.format("%.2f", result);
		calcScreen.setText(answer);
	}
	
	public void subtract(double firstNum,double secondNum) {
		result = firstNum-secondNum;
		answer = String.format("%.2f", result);
		calcScreen.setText(answer);
	}
	
	public void modulus(double firstNum,double secondNum) {
		result = firstNum%secondNum;
		answer = String.format("%.2f", result);
		calcScreen.setText(answer);
	}
	public void setOperation(String operation) {
		firstNum = Double.parseDouble(calcScreen.getText());
		calcScreen.setText(" ");
		this.operation = operation;
	}
	
}
