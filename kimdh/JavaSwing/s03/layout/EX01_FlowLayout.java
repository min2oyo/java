package s03.layout;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import s02.addcomponents.EX02_AddComponents_2;

public class EX01_FlowLayout extends JFrame{
	
	public EX01_FlowLayout() {
		//# 기본속성 설정
		this.setTitle("FlowLayout");
		this.setBounds(100, 100, 300, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);	
		
		//@Step1. 최상위 컨테이너 가져오기
		Container root = this.getContentPane();
		//@Step2. 레이아웃 설정
		root.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));
		//@Step3. 컴퍼넌트 추가하기
		root.add(new JButton("Button1"));
		root.add(new JButton("Button2"));
		root.add(new JButton("Button3"));
		root.add(new JButton("Button4"));
		root.add(new JButton("Button5"));
	}
	
	public static void main(String[] args) {
		new EX01_FlowLayout();
	}
}
