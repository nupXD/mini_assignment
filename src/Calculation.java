import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculation extends Frm
{
	Frm abc = new Frm();
	int ddoocp,cn,osd,ddw,total,per;
	JFrame frm2;
	JLabel m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12,m13,m14,m15,m16,m17;
	Marks xyz = new Marks();
	int a = xyz.getRoll();
	
	public Calculation() 
	{
		ddoocp =Integer.parseInt(abc.t3.getText());
		cn=Integer.parseInt(abc.t4.getText());
		osd=Integer.parseInt(abc.t5.getText());
		ddw=Integer.parseInt(abc.t6.getText());
		
		total=ddoocp+cn+osd+ddw;
		per=total/4;
		
		
		
		frm2 = new JFrame("Marksheet");
		frm2.setSize(600, 600);
		frm2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm2.setVisible(true);
		frm2.setLayout(null);
		
		m1= new JLabel("Marksheet");
		m1.setBounds(200, 20, 100, 40);
		frm2.add(m1);
		
		m2 = new JLabel("Student Name:");
		m2.setBounds(20, 80, 120, 30);
		frm2.add(m2);
		
		m3= new JLabel(xyz.getName());
		m3.setBounds(130, 80, 150, 30);
		frm2.add(m3);
		
		m4 = new JLabel("Roll NO:");
		m4.setBounds(20, 120, 120, 30);
		frm2.add(m4);
		
		m5 = new JLabel(a + " ");
		m5.setBounds(130, 120, 120, 30);
		frm2.add(l5);
		
		m6 = new JLabel("DDOOCP:");
		m6.setBounds(20, 200, 120, 30);
		frm2.add(m6);
		
		m7 = new JLabel(abc.t3.getText());
		m7.setBounds(130, 200, 120, 30);
		frm2.add(m7);
		
		m8 = new JLabel("CN:");
		m8.setBounds(20, 240, 120, 30);
		frm2.add(m8);
		
		m9 = new JLabel(abc.t4.getText());
		m9.setBounds(130, 240, 120, 30);
		frm2.add(m9);
		
		m10 = new JLabel("OSD:");
		m10.setBounds(20, 280, 120, 30);
		frm2.add(m10);
		
		m11 = new JLabel(abc.t5.getText());
		m11.setBounds(130, 280, 120, 30);
		frm2.add(m11);
		
		m12 = new JLabel("DDW:");
		m12.setBounds(20, 320, 120, 30);
		frm2.add(m12);
		
		m13 = new JLabel(abc.t6.getText());
		m13.setBounds(130, 320, 120, 30);
		frm2.add(m13);
		
		m14 = new JLabel("Total:");
		m14.setBounds(20, 360, 120, 30);
		frm2.add(m14);
		
		m15 = new JLabel(total + " ");
		m15.setBounds(130, 360, 120, 30);
		frm2.add(m15);
		
		m16 = new JLabel("Percentage:");
		m16.setBounds(180, 360, 120, 30);
		frm2.add(m16);
		
		m17 = new JLabel(per + " ");
		m17.setBounds(220, 360, 120, 30);
		frm2.add(m17);
		
		
}
}