import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class diabetes_meter {
	diabetes_meter()
	{
		generDiabet();
	}
	diabetes_meter(String t, double glc){
		JOptionPane.showMessageDialog(null, "Status: "+calculate_dia(t,glc));
	}
	
public void generDiabet()
{
	JFrame fr=new JFrame();
	fr.setVisible(true);
	fr.setSize(400,300);
	fr.setLocation(700,200);
	
	String [] t={"Before-Breakfast","Before-lunch","2-hours-after-meal","Bedtime"};
	JLabel lbl21 = new JLabel("Select time: ");
	JComboBox cb=new JComboBox(t);
	String tm=cb.getSelectedItem().toString();   //time
	
	JPanel p2=new JPanel(new GridBagLayout());
	int rd = 200;
	int gr = 150;
	int bl = 100;
	Color bc1 = new Color(rd,gr,bl);
	p2.setBackground(bc1);
	
	JLabel lbl22 = new JLabel("Gloucose level in blood: ");
	JTextField jt = new JTextField();
	jt.setPreferredSize(new Dimension(100, 24));
	
	JLabel lbl23=new JLabel("Status: ");
	JButton b21=new JButton("Check diabetes");
	
	b21.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			double glc=Double.parseDouble(jt.getText()); //gloucose
			String tex=calculate_dia(tm, glc);
			lbl23.setText(tex);
		}
	});
	
	GridBagConstraints g2=new GridBagConstraints();
	g2.insets=new Insets(10,10,10,10);
	
	g2.gridx=0;
	g2.gridy=1;
	p2.add(lbl22,g2);
	
	g2.gridx=0;
	g2.gridy=2;
	p2.add(jt,g2);
	
	g2.gridx=0;
	g2.gridy=3;
	p2.add(lbl21,g2);
	
	g2.gridx=0;
	g2.gridy=4;
	p2.add(cb,g2);
	
	g2.gridx=0;
	g2.gridy=5;
	p2.add(lbl23);
	p2.add(b21);
	
	fr.add(p2,BorderLayout.WEST);
}


String calculate_dia(String time, double glc){
	if(time.equals("Before-Breakfast")) //Before Breakfast
	{
		if(glc>100)
		{
			return "You got Diabetes. Immedialtely meet a physician for checkup";
		}
		else
		{
			return "Your Diabetes lavel is normal";
		}
		
	}
	if(time.equals("Before-lunch")) //Before lunch
	{
	    if(glc>110)
		{
			return "You got Diabetes. Immedialtely meet a physician for checkup";
		}
	    else
		{
			return "Your Diabetes lavel is normal";
		}
	}
	if(time.equals("2-hours-after-meal")) //2 hours after meal
	{
		if(glc>140)
		{
			return "You got Diabetes. Immedialtely meet a physician for checkup";
		}
		else
		{
	         return "Your Diabetes lavel is normal";
		}
	}
	if(time.equals("Bedtime")) //Bedtime
	{
		if(glc>120)
		{
			return "You got Diabetes. Immedialtely meet a physician for checkup";
		}
		else
		{
			return "Your Diabetes lavel is normal";
		}
		
	}
	else{
		return "Invalid input. Report!";
	}
}
}
