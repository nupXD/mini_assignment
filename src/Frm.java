import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Frm 
{

	JFrame frame;
	JLabel l1,l2,l3,l4,l5,l6,l7;
	JTextField t1,t2,t3,t4,t5,t6;
	JButton btm;
	public Frm() 
	{
		frame = new JFrame("Student Details");
		frame.setSize(600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLayout(null);
		
		JLabel l1= new JLabel("Student Details");
		l1.setBounds(200, 20, 100, 40);
		frame.add(l1);
		
		JLabel l2= new JLabel("Student name: ");
		l2.setBounds(20, 80, 120, 30);
		frame.add(l2);
		
		t1= new JTextField();
		t1.setBounds(130, 80, 150, 30);
		frame.add(t1);
		
		JLabel l3= new JLabel("Roll No: ");
		l3.setBounds(350,80, 80, 30);
		frame.add(l3);
		
		t2 = new JTextField();
		t2.setBounds(400, 80, 180, 30);
		frame.add(t2);
		
		
		JLabel l4= new JLabel("DDOCP: ");
		l4.setBounds(20, 160, 80, 40);
		frame.add(l4);
		
		t3 = new JTextField();
		t3.setBounds(70, 160, 80, 40);
		frame.add(t3);
		
	
		JLabel l5= new JLabel("CN: ");
		l5.setBounds(250, 160, 80, 40);
		frame.add(l5);
		
		t4 = new JTextField();
		t4.setBounds(290, 160, 80, 40);
		frame.add(t4);
		
		
		JLabel l6= new JLabel("OSD: ");
		l6.setBounds(20, 240, 80, 40);
		frame.add(l6);
		
		t5 = new JTextField();
		t5.setBounds(70, 240, 80, 40);
		frame.add(t5);
		
		
		JLabel l7= new JLabel("DDW:");
		l7.setBounds(250, 240, 80, 40);
		frame.add(l7);
		
		t6 = new JTextField();
		t6.setBounds(290, 240, 80, 40);
		frame.add(t6);
		
		btm = new JButton("Calculate");
		btm.setBounds(100, 330, 100, 50);
		frame.add(btm);
		

		
		
	}
	
	
}
