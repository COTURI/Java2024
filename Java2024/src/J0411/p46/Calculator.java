package J0411.p46;

import java.awt.Button;

import java.awt.Frame;
import java.awt.TextField;

public class Calculator {
	private Frame f;
	private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,bp,bm,b0,bmu,ban,bdv;
	private TextField tf;
	
	public Calculator() {
		f = new Frame("Calculator");
		f.setSize(800,300);
		f.setLayout(null);
		
		tf = new TextField(50);
		tf.setSize(120,30);
		tf.setLocation(50,50);
		b1 = new Button("1");
		b1.setSize(30,30);
		b1.setLocation(50,140);
		b2 = new Button("2");
		b2.setSize(30,30);
		b2.setLocation(80,140);
		b3 = new Button("3");
		b3.setSize(30,30);
		b3.setLocation(110,140);
		bp = new Button("+");
		bp.setSize(30,30);
		bp.setLocation(140,140);
		b4 = new Button("4");
		b4.setSize(30,30);
		b4.setLocation(50,110);
		b5 = new Button("5");
		b5.setSize(30,30);
		b5.setLocation(80,110);
		b6 = new Button("6");
		b6.setSize(30,30);
		b6.setLocation(110,110);
		bm = new Button("-");
		bm.setSize(30,30);
		bm.setLocation(140,110);
		b7 = new Button("7");
		b7.setSize(30,30);
		b7.setLocation(50,80);
		b8 = new Button("8");
		b8.setSize(30,30);
		b8.setLocation(80,80);
		b9 = new Button("9");
		b9.setSize(30,30);
		b9.setLocation(110,80);
		bmu = new Button("*");
		bmu.setSize(30,30);
		bmu.setLocation(140,80);
		b0 = new Button("0");
		b0.setSize(30,30);
		b0.setLocation(80,170);
		bdv = new Button("/");
		bdv.setSize(30,30);
		bdv.setLocation(110,170);
		ban = new Button("=");
		ban.setSize(30,30);
		ban.setLocation(140,170);
		
		
		f.add(tf);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(b0);
		f.add(bp);
		f.add(bm);
		f.add(bmu);
		f.add(bdv);
		f.add(ban);
		f.setVisible(true);
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Calculator();
	}

}
