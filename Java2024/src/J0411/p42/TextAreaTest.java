package J0411.p42;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;

public class TextAreaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("Comments");
		f.setSize(400,220);
		f.setLayout(new FlowLayout());
		
		TextArea comments = new TextArea("하고 싶은 말을 적으세요.");
		
		f.add(comments);
		comments.selectAll();
		f.setVisible(true);
	}
}
