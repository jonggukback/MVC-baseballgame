package javax_swing;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JFrameTest extends JFrame{

	public JFrameTest() {
		super("JFrame 테스트");
		JButton btn1 = new JButton("추가");
		JButton btn2 = new JButton("삭제");
		JTextField tf1 = new JTextField("JFrame 테스트");
		
		Container con = getContentPane();
		con.add(tf1, "North");
		con.add(btn1, "Center");
		con.add(btn2, "South");
		setSize(200,300);
		setVisible(true);
		
		// X누르면 종료 시키겠다
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	public static void main(String[] args) {
		new JFrameTest();
	}

}
