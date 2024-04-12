package J0411.p46;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWTCalc implements ActionListener {
	private Frame f;
	private TextField tf;
	private Panel p;
	private Button[] btnNum;

	private Button bPlus, bMinus, bMul, bDiv, bRes, bc;
	private int operand = 0;

	private enum OP {
		OP_NULL, OP_PLUS, OP_MINUS, OP_MUL, OP_DIV
	};

	private OP op = OP.OP_NULL;
	private OP opOne = OP.OP_NULL;

	public AWTCalc() {
		f = new Frame("Calculator!");
		f.setSize(400, 300);
		f.setLocation(50, 50);

		tf = new TextField("0");

		p = new Panel();
		p.setLayout(new GridLayout(4, 0));

		btnNum = new Button[10];
		for (int i = 0; i < btnNum.length; i++) {
			String num = String.valueOf(i);
			btnNum[i] = new Button(num);
		}

		for (int i = 0; i < btnNum.length; i++) {
			btnNum[i].addActionListener(this);
		}

		bPlus = new Button("+");
		bMinus = new Button("-");
		bMul = new Button("*");
		bDiv = new Button("/");
		bRes = new Button("=");
		bc = new Button("C");

		bPlus.addActionListener(this);
		bMinus.addActionListener(this);
		bMul.addActionListener(this);
		bDiv.addActionListener(this);
		bRes.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			});}
		

		for (int i = 0; i < btnNum.length; i++) {
			p.add(btnNum[i]);
		}

		p.add(bPlus);
		p.add(bMinus);
		p.add(bMul);
		p.add(bDiv);
		p.add(bRes);
		p.add(bc);
		
		f.add(tf, BorderLayout.NORTH);
		f.add(p, BorderLayout.CENTER);

		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().equals("C")) {
			tf.setText("0");
		}

		System.out.println("112 : " + e.getActionCommand());

		String tfText = tf.getText();

		if (e.getActionCommand().equals("0")) {
			System.out.println("0");

			if (tfText.equals("0")) {

			} else {
				tfText += "0";
				tf.setText(tfText);
			}
		}

		for (int i = 1; i < btnNum.length; i++) {
			if (e.getActionCommand().equals(String.valueOf(i))) {
				System.out.println(i);

				if (op == OP.OP_NULL) {
					if (tfText.equals("0") && (op == OP.OP_NULL)) {
						tf.setText(String.valueOf(i));
					} else {
						tfText += String.valueOf(i);
						tf.setText(tfText);
					}
				} else {
					tf.setText(String.valueOf(i));
					op = OP.OP_NULL;
				}
			}
		}

		if (e.getActionCommand().equals("+")) {
			System.out.println("+");

			op = OP.OP_PLUS;
			opOne = OP.OP_PLUS;
			operand = Integer.parseInt(tf.getText());
			System.out.println(operand);
		}
		if (e.getActionCommand().equals("-")) {
			System.out.println("-");
		}
		if (e.getActionCommand().equals("*")) {
			System.out.println("*");
		}
		if (e.getActionCommand().equals("/")) {
			System.out.println("/");
		}
		if (e.getActionCommand().equals("=")) {
			System.out.println("=");

			System.out.println(operand);
			System.out.println(opOne);
			System.out.println(tf.getText());

			int result = 0;
			if (opOne == op.OP_PLUS) {
				result = operand + Integer.parseInt(tf.getText());
			}
			tf.setText(String.valueOf(result));
		}
	}

	public static void main(String[] args) {
		new AWTCalc();
	}
}