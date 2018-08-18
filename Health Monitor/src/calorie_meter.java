import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class calorie_meter {
	String gend;
	double age, cal;
	int active; //1 for Sedentary, 2 for Moderately Active, 3 for Active
	//General Constructor
	calorie_meter()
	{
		generCal();
	}
	//Constructor for test class
	calorie_meter(String g, double age, int ac, double cal)
	{
		JOptionPane.showMessageDialog(null, "Status: "+calCal(g,age,ac,cal));
	}
	
	//Generate calorie meter user interface:
	public void generCal()
	{ 
		JFrame f=new JFrame("Daily Calorie consumption Check");
		f.setVisible(true);
		f.setSize(600,400);
		f.setLocation(700,200);
		JPanel p=new JPanel();
		int r = 255;
		int gr = 178;
		int bl = 102;
		Color bc = new Color(r,gr,bl);
		p.setBackground(bc);
		
		
		JLabel lblg = new JLabel("Please, enter your gender keyword: (Child=\"c\", Female=\"f\" Male=\"m\") ");
		JTextField jtg = new JTextField();
		jtg.setPreferredSize(new Dimension(30, 24));
		p.add(lblg);
		p.add(jtg);
		
		JLabel lbla = new JLabel("Enter your age: (Child=\"Less than 4 years\", Female & Male=\"more than 4 years\") ");
		JTextField jta = new JTextField();
		jta.setPreferredSize(new Dimension(30, 24));
		p.add(lbla);
		p.add(jta);
		
		JLabel lblh = new JLabel("Please, enter your activity level: (\"1\" No work at all, \"2\" Moderate work ,\"1\" Heavy work: ");
		JTextField jtact = new JTextField();
		jtact.setPreferredSize(new Dimension(30, 24));
		p.add(lblh);
		p.add(jtact);
		
		JLabel lblc = new JLabel("Please, enter amount of calorie you take everyday ");
		JTextField jtc = new JTextField();
		jtc.setPreferredSize(new Dimension(30, 24));
		p.add(lblc);
		p.add(jtc);
		
		JButton b=new JButton("Click to check your consumption");
		
		JLabel lblr = new JLabel("Your calorie consumption Status: \n\n\n");
		p.add(lblr);
		
		b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				gend=jtg.getText();
				age=Double.parseDouble(jta.getText());
				active=Integer.parseInt(jtact.getText());
				cal=Double.parseDouble(jtc.getText());
				lblr.setText(calCal(gend,age,active,cal));
			}
		});
		p.add(b);
		f.add(p);
		
		
	
	}
	
	//Calculate daily calorie consumption
	public String calCal(String gend, double age, int act, double cal){
		if(gend.equals("c")||gend.equals("C"))
		{
			if(age<4)
			{
				if(cal<=1200)
					return "You need"+(1200-cal)+" more";
				else
					return "Your should eat less "+(cal-1200)+" calories";
			}
			else
				return "Please, enter Age correctly!";
		}
		else if(gend.equals("f")||gend.equals("F"))
		{
			if(age>=4 && age<8)
			{
				if(act==1)
				{
					if(cal<=1200)
						return "You need"+(1200-cal)+" more";
					else
						return "Your should burn "+(cal-1200)+" calories through excercising";
				}
				else if(act==2)
				{
					if(cal<=1400)
						return "You need"+(1400-cal)+" more";
					else
						return "Your should burn "+(cal-1400)+" calories through excercising";
				}
				else if(act==3)
				{
					if(cal<=1600)
						return "You need"+(1600-cal)+" more";
					else
						return "Your should burn "+(cal-1600)+" calories through excercising";
				}
				else
					return "Please, enter Activity correctly!";
				
			}
			else if(age>=8 && age<13)
			{
				if(act==1)
				{
					if(cal<=1600)
						return "You need"+(1600-cal)+" more";
					else
						return "Your should burn "+(cal-1600)+" calories through excercising";
				}
				else if(act==2)
				{
					if(cal<=1800)
						return "You need"+(1800-cal)+" more";
					else
						return "Your should burn "+(cal-1800)+" calories through excercising";
				}
				else if(act==3)
				{
					if(cal<=2000)
						return "You need"+(2000-cal)+" more";
					else
						return "Your should burn "+(cal-2000)+" calories through excercising";
				}
				else
					return "Please, enter Activity correctly!";
				
			}
			else if(age>=13 && age<18)
			{
				if(act==1)
				{
					if(cal<=1800)
						return "You need"+(1800-cal)+" more";
					else
						return "Your should burn "+(cal-1800)+" calories through excercising";
				}
				else if(act==2)
				{
					if(cal<=2000)
						return "You need"+(2000-cal)+" more";
					else
						return "Your should burn "+(cal-2000)+" calories through excercising";
				}
				else if(act==3)
				{
					if(cal<=2400)
						return "You need"+(2400-cal)+" more";
					else
						return "Your should burn "+(cal-2400)+" calories through excercising";
				}
				else
					return "Please, enter Activity correctly!";
			}
			else if(age>=18 && age<30)
			{
				if(act==1)
				{
					if(cal<=2000)
						return "You need"+(2000-cal)+" more";
					else
						return "Your should burn "+(cal-1600)+" calories through excercising";
				}
				else if(act==2)
				{
					if(cal<=2100)
						return "You need"+(2100-cal)+" more";
					else
						return "Your should burn "+(cal-2100)+" calories through excercising";
				}
				else if(act==3)
				{
					if(cal<=2400)
						return "You need"+(2400-cal)+" more";
					else
						return "Your should burn "+(cal-2400)+" calories through excercising";
				}
				else
					return "Please, enter Activity correctly!";
			}
			else if(age>=30 && age<50)
			{
				if(act==1)
				{
					if(cal<=1800)
						return "You need"+(1800-cal)+" more";
					else
						return "Your should burn "+(cal-1800)+" calories through excercising";
				}
				else if(act==2)
				{
					if(cal<=2000)
						return "You need"+(2000-cal)+" more";
					else
						return "Your should burn "+(cal-2000)+" calories through excercising";
				}
				else if(act==3)
				{
					if(cal<=2200)
						return "You need"+(2200-cal)+" more";
					else
						return "Your should burn "+(cal-2200)+" calories through excercising";
				}
				else
					return "Please, enter Activity correctly!";
			}
			else if(age>=50)
			{
				if(act==1)
				{
					if(cal<=1600)
						return "You need"+(1600-cal)+" more";
					else
						return "Your should burn "+(cal-1600)+" calories through excercising";
				}
				else if(act==2)
				{
					if(cal<=1800)
						return "You need"+(1800-cal)+" more";
					else
						return "Your should burn "+(cal-1800)+" calories through excercising";
				}
				else if(act==3)
				{
					if(cal<=2100)
						return "You need"+(2100-cal)+" more";
					else
						return "Your should burn "+(cal-2100)+" calories through excercising";
				}
				else
					return "Please, enter Activity correctly!";
			}
			else
				return "Please, enter Age correctly!";
		}
		else if(gend.equals("m")||gend.equals("M"))
		{

			if(age>=4 && age<8)
			{
				if(act==1)
				{
					if(cal<=1400)
						return "You need"+(1400-cal)+" more";
					else
						return "Your should burn "+(cal-1400)+" calories through excercising";
				}
				else if(act==2)
				{
					if(cal<=1500)
						return "You need"+(1500-cal)+" more";
					else
						return "Your should burn "+(cal-1500)+" calories through excercising";
				}
				else if(act==3)
				{
					if(cal<=2000)
						return "You need"+(2000-cal)+" more";
					else
						return "Your should burn "+(cal-2000)+" calories through excercising";
				}
				else
					return "Please, enter Activity correctly!";
				
			}
			else if(age>=8 && age<13)
			{
				if(act==1)
				{
					if(cal<=1800)
						return "You need"+(1800-cal)+" more";
					else
						return "Your should burn "+(cal-1800)+" calories through excercising";
				}
				else if(act==2)
				{
					if(cal<=2000)
						return "You need"+(2000-cal)+" more";
					else
						return "Your should burn "+(cal-2000)+" calories through excercising";
				}
				else if(act==3)
				{
					if(cal<=2500)
						return "You need"+(2500-cal)+" more";
					else
						return "Your should burn "+(cal-2500)+" calories through excercising";
				}
				else
					return "Please, enter Activity correctly!";
				
			}
			else if(age>=13 && age<18)
			{
				if(act==1)
				{
					if(cal<=2200)
						return "You need"+(2200-cal)+" more";
					else
						return "Your should burn "+(cal-2200)+" calories through excercising";
				}
				else if(act==2)
				{
					if(cal<=2600)
						return "You need"+(2600-cal)+" more";
					else
						return "Your should burn "+(cal-2600)+" calories through excercising";
				}
				else if(act==3)
				{
					if(cal<=3000)
						return "You need"+(3000-cal)+" more";
					else
						return "Your should burn "+(cal-3000)+" calories through excercising";
				}
				else
					return "Please, enter Activity correctly!";
			}
			else if(age>=18 && age<30)
			{
				if(act==1)
				{
					if(cal<=2400)
						return "You need"+(2400-cal)+" more";
					else
						return "Your should burn "+(cal-2400)+" calories through excercising";
				}
				else if(act==2)
				{
					if(cal<=2750)
						return "You need"+(2750-cal)+" more";
					else
						return "Your should burn "+(cal-2750)+" calories through excercising";
				}
				else if(act==3)
				{
					if(cal<=3000)
						return "You need"+(3000-cal)+" more";
					else
						return "Your should burn "+(cal-3000)+" calories through excercising";
				}
				else
					return "Please, enter Activity correctly!";
			}
			else if(age>=30 && age<50)
			{
				if(act==1)
				{
					if(cal<=2200)
						return "You need"+(2200-cal)+" more";
					else
						return "Your should burn "+(cal-2200)+" calories through excercising";
				}
				else if(act==2)
				{
					if(cal<=2500)
						return "You need"+(2500-cal)+" more";
					else
						return "Your should burn "+(cal-2500)+" calories through excercising";
				}
				else if(act==3)
				{
					if(cal<=3000)
						return "You need"+(3000-cal)+" more";
					else
						return "Your should burn "+(cal-3000)+" calories through excercising";
				}
				else
					return "Please, enter Activity correctly!";
			}
			else if(age>=50)
			{
				if(act==1)
				{
					if(cal<=2000)
						return "You need"+(2000-cal)+" more";
					else
						return "Your should burn "+(cal-2000)+" calories through excercising";
				}
				else if(act==2)
				{
					if(cal<=2300)
						return "You need"+(2300-cal)+" more";
					else
						return "Your should burn "+(cal-2300)+" calories through excercising";
				}
				else if(act==3)
				{
					if(cal<=2700)
						return "You need"+(2700-cal)+" more";
					else
						return "Your should burn "+(cal-2700)+" calories through excercising";
				}
				else
					return "Please, enter Activity correctly!";
			}
			else
					return "Please, enter Age correctly!";
		}
		else
		{
			return "Wrong keyword entered! Try again.";
		}
	}
}