import javax.swing.JFrame;
import javax.swing.JLabel;

public class Calculation extends Frm
{
	Frm abc = new Frm();
	int ddoocp,cn,osd,ddw,total,per;
	JFrame frm2;
	
	
	public Calculation() 
	{
		ddoocp =Integer.parseInt(abc.t3.getText());
		cn=Integer.parseInt(abc.t4.getText());
		osd=Integer.parseInt(abc.t5.getText());
		ddw=Integer.parseInt(abc.t6.getText());
		
		
		
		total=ddoocp+cn+osd+ddw;
		per=total/4;
		
		
}
}