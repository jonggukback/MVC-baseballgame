package javax_swing;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JMenuTest1 {
	JFrame f;
	JMenuBar menuBar;
	JMenu carMenu,memberMenu, rentMenu, helpMenu; // 메인 메뉴 항목
	
	// 서브 메뉴 항목
		JMenuItem carMenu11,carMenu12,carMenu13,carMenu14;
		JMenuItem memberMenu11, memberMenu12, memberMenu13, memberMenu14;
		JMenuItem rentMenu11, rentMenu12, rentMenu13, rentMenu14;
		JMenuItem helpMenu41;
	JPanel jPanel;
	JLabel ICarName;
	JTextField tf;
	JButton searchBtn;
	
	//생성자 메인메뉴 생성 객체주입
	public JMenuTest1() {
		f = new JFrame("렌트카 예약 시스템");
		menuBar = new JMenuBar();
			// 메인 메뉴 항목 객체 생성
		carMenu = new JMenu("차량 관리");
		memberMenu = new JMenu("회원 관리");
		rentMenu = new JMenu("예약 관리");
		helpMenu = new JMenu("도움말");

	}
	
	//서브 메뉴 생성
	protected void startFrame() {
		f.setJMenuBar(menuBar); // JFrame에 메뉴바를 단다
		menuBar.add(carMenu);	// 메뉴바에 "파일" 항목을 단다.
		//차량관리 메뉴 관련 서브메뉴 항목
		carMenu.add(carMenu11 = new JMenuItem("차량 등록"));
		carMenu.add(carMenu12 = new JMenuItem("차량 조회"));
		carMenu.addSeparator();
		carMenu.add(carMenu13 = new JMenuItem("차량 수정"));
		carMenu.add(carMenu14 = new JMenuItem("차량 삭제"));
		
		menuBar.add(memberMenu);	// 메뉴바에 "파일" 항목을 단다.
		//회원관리 메뉴 관련 서브메뉴 항목
		memberMenu.add(memberMenu11 = new JMenuItem("회원 등록"));
		memberMenu.add(memberMenu12 = new JMenuItem("회원 조회"));
		memberMenu.addSeparator();
		memberMenu.add(memberMenu13 = new JMenuItem("회원 수정"));
		memberMenu.add(memberMenu14 = new JMenuItem("회원 삭제"));
		
		menuBar.add(helpMenu);
		helpMenu.add(helpMenu41 = new JMenuItem("버전"));
		
		jPanel = new JPanel();
		ICarName = new JLabel("차랑명");
		tf = new JTextField(10);
		searchBtn = new JButton("차량 조회하기");
		jPanel.add(ICarName);
		jPanel.add(tf);
		jPanel.add(searchBtn);
		Container con = f.getContentPane();
		con.add(jPanel,"North");
		f.setLocation(200,100);
		f.setSize(800,600);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		JMenuTest1 v1 = new JMenuTest1();
		v1.startFrame();
	}

}
