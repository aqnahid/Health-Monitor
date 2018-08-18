import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class heart_meter {
	double age,hRate;
	heart_meter()
	{
		createHeart();
	}
	public void createHeart()
	{

		JFrame f=new JFrame("Heart Check");
		f.setVisible(true);
		f.setSize(400,300);
		f.setLocation(700,200);
		
		JPanel p=new JPanel();
		int rd = 255;
		int gr = 51;
		int bl = 51;
		Color bc1 = new Color(rd,gr,bl);
		p.setBackground(bc1);
		
		
		JLabel lbla = new JLabel("Please, enter your age: ");
		JTextField jta = new JTextField();
		jta.setPreferredSize(new Dimension(100, 24));
		p.add(lbla);
		p.add(jta);
		
		JLabel lblh = new JLabel("Please, enter your heart rate in normal time: ");
		p.add(lblh);
		JTextField jth = new JTextField();
		jth.setPreferredSize(new Dimension(100, 24));
		p.add(jth);
		
		JButton b=new JButton("Click to check heart health");
		
		JLabel lblr = new JLabel("Your heart Status: ");
		p.add(lblr);
		
		b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				age=Double.parseDouble(jta.getText());
				hRate=Double.parseDouble(jth.getText());
				lblr.setText(heartCheck(age,hRate));
			}
		});
		p.add(b);
		f.add(p);
		
		
	}
	
	public String heartCheck(double a, double r)
	{
		if(age<=20 && (r>=150 && r<=200))
		{
			return "Your heart is healthy enough";
		}
		
		else if((age>20 && age<=30) && (r>=120 && r<=190))
		{
			return "Your heart is healthy enough";
		}
		else if((age>30 && age<=35) && (r>=110 && r<=185))
		{
			return "Your heart is healthy enough";
		}
		else if((age>35 && age<=40) && (r>=105 && r<=180))
		{
			return "Your heart is healthy enough";
		}
		else if((age>40 && age<=55) && (r>=100 && r<=170))
		{
			return "Your heart is healthy enough";
		}
		else if((age>55 && age<=65) && (r>=90 && r<=155))
		{
			return "Your heart is healthy enough";
		}
		else if((age>65) && (r>=95 || r<=150))
		{
			return "Your heart is healthy enough";
		}
		else
			return "You got heart desease.Immediately consult a physician";
	}
}