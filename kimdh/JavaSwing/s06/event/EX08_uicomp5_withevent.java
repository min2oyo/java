package s06.event;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Arrays;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

//JComboBox and JList

public class EX08_uicomp5_withevent extends JFrame {
	public EX08_uicomp5_withevent() {
				
		//@Step1. 최상위 컨테이너 가져오기
		Container root = this.getContentPane();
		//@Step2. 레이아웃 설정
		root.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
		//@Step3. 컴퍼넌트 추가하기
		
		//JComboBox
		JComboBox cb1 = new JComboBox(); //기본 ComboBox + addItem으로 추가 + removeItem으로 삭제 (//전체 데이터 삭제)
		cb1.addItem("JComboBox 11");
		cb1.addItem("JComboBox 12");
		cb1.addItem("JComboBox 13");
		
		cb1.removeItem("JComboBox 12");		
		//cb1.removeAllItems(); 전체 삭제
		
		String[] arrayItems = {"JComboBox 21", "JComboBox 22", "JComboBox 23"};
		JComboBox cb2 = new JComboBox(arrayItems); //배열을 데이터로 가지는 ComboBox + 데이터 추가 (뒤에만 추가 가능)
		cb2.addItem("JComboBox 24");
		
		Vector<String> vectorItems1 = new Vector<>();		
		JComboBox cb3 = new JComboBox(vectorItems1); //Vector<>를 데이터로 가지는 ComboBox + 데이터 임의 추가 및 삭제 (데이터 Vector<>를 변경) + 선택위치변경
		vectorItems1.add("JComboBox 31");
		vectorItems1.add("JComboBox 32");
		vectorItems1.add(1,"JComboBox 33");
		cb3.setSelectedIndex(1);
		
		DefaultComboBoxModel<String> cbm = new DefaultComboBoxModel<>();
		JComboBox cb4 = new JComboBox(cbm);
		cbm.addElement("JComboBox 41");
		cbm.addElement("JComboBox 42");
		cbm.addElement("JComboBox 43");
		cbm.removeElementAt(1);
		cbm.insertElementAt("JComboBox 44", 1);
		
		//JList
		
		JList list1 = new JList(); //기본 List JList에는 addItem()이 없어 //이 경우 데이터 추가 삭제 안됨
		String[] strs1 = {"JList 11", "JList 12", "JList 13", "JList 14"};
		list1.setListData(strs1);
		
		
		String[] strs2 = {"JList 21", "JList 22", "JList 23", "JList 24"};
		JList list2 = new JList(strs2);
		list2.setBorder(new LineBorder(Color.RED, 2));
		
		Vector<String> vectorItems2 = new Vector<>();		
		JList list3 = new JList(vectorItems2);
		vectorItems2.add("JList 31");
		vectorItems2.add("JList 32");
		vectorItems2.add("JList 33");	
		vectorItems2.remove(0);
		vectorItems2.add(1, "JList 34");
		vectorItems2.add("JList 35");
		list3.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		DefaultListModel<String> listmodel = new DefaultListModel<>(); //Model 객체로 데이터 입력 + 단일항목 선택
		JList list4 = new JList(listmodel);
		listmodel.addElement("JList 41");
		listmodel.addElement("JList 42");
		listmodel.addElement("JList 43");
		listmodel.removeElementAt(1);
		listmodel.insertElementAt("JList 44", 1);
		listmodel.addElement("JList 45");
		list4.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
				
		Vector<String> vectorItems3 = new Vector<>(); //Scroll기능 포함+ 크기지정
		JList list5 = new JList(vectorItems3);
		JScrollPane sp = new JScrollPane(list5);		
		sp.setPreferredSize(new Dimension(70, 100));
		list4.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		for(int i=0; i<10; i++)
			vectorItems3.add("JList 5"+i);
						
		root.add(cb1);
		root.add(cb2);
		root.add(cb3);
		root.add(cb4);
		
		root.add(list1);
		root.add(list2);
		root.add(list3);
		root.add(list4);
		root.add(sp);
		
		//event 처리. ==================================		
		//이벤트 @1. 첫번째 cb1에서 JComboBox11항목이 선택되면 list2의 테두리색을 빨간색, JComboBox13 항목을 선택하면 list2의 테두리 색을 파란색으로 변경	
		cb1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) { 
				//Item선택이 바뀐 경우 두번 (이전값, 새로운값) 호출
				if(e.getStateChange()==ItemEvent.DESELECTED) { //이전 값
					//System.out.println("Deselected:" + e.getItem()); 
				}
				if(e.getStateChange()==ItemEvent.SELECTED) { //새로운값
					if(((String)e.getItem()).equals("JComboBox 11"))
						list2.setBorder(new LineBorder(Color.RED,2));
					else if (((String)e.getItem()).equals("JComboBox 13"))
						list2.setBorder(new LineBorder(Color.BLUE,2));
				}
			}
		});
		
		//이벤트 @2. 첫번째 list1의 선택항목을 그대로 list2 에서 선택
		list1.addListSelectionListener(new ListSelectionListener() {			
			@Override
			public void valueChanged(ListSelectionEvent e) {				
				//System.out.println(e.getValueIsAdjusting()); //선택변경시 두번 호출 true, false 새로운 선택값은 true일때 한번만 처리
				if(e.getValueIsAdjusting()) {
					int[] selectedItems = list1.getSelectedIndices(); //선택된 다중 데이터의 인덱스 배열
					list2.setSelectedIndices(selectedItems);
					//System.out.println(Arrays.toString(selectedItems));
				}
			}
		});
		//====================================================================
			
		
		//# 기본속성 설정
		this.setTitle("UICompoents(JComboBox and JList)");
		this.setBounds(100, 100, 600, 220);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);	
	}
	
	public static void main(String[] args) {
		new EX08_uicomp5_withevent();
	}
}
