import java.util.Arrays;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class arrange{
	static String db[][]={{"nahid","bhai@bro"},
			           {"umar","kodeknight"},
			           {"osama","theCuteGuy"}
			          };
	static String[][] addNewMember(String [][] arr, String id,String passW) {
		int s=arr.length;
	    arr  = Arrays.copyOf(arr, s+1);
	    arr[s-1][0]=id;
	    arr[s-1][1]=passW;
	    return arr;
}
	
	public static void main(String[] args){
		
		user us=new user();
		diabetes_meter dbt=new diabetes_meter();
	
	JFrame f=new JFrame("Health care 911");
	f.setVisible(true);
	f.setSize(1080,720);
	f.setLocation(150, 100);

	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//For image:
	int r = 200;
	int gr = 150;
	int b = 100;
	Color bc1 = new Color(r,gr,b);
	JPanel imP=new JPanel(new GridBagLayout());
	GridBagConstraints g1=new GridBagConstraints();
	g1.insets=new Insets(10,10,10,10);
	imP.setBackground(bc1);
	ImageIcon im0=new ImageIcon("panel.png");
	JLabel imL=new JLabel(im0);
	imP.add(imL,g1);
	imP.setSize(700,720);
	
	//For Buttons:
	int red = 200;
	int green = 150;
	int blue = 100;
	Color bc = new Color(red,green,blue);
	JPanel p=new JPanel(new GridBagLayout());
	p.setBackground(bc);
	GridBagConstraints g=new GridBagConstraints();
	g.insets=new Insets(10,10,10,10);
	
	ImageIcon im1=new ImageIcon("cal.png");
	JButton b1=new JButton("Check daily calorie consumption",im1);
	ImageIcon im2=new ImageIcon("diabetes.png");
	JButton b2=new JButton("Check diabetes level                .",im2);
	ImageIcon im3=new ImageIcon("heartbeat.png");
	JButton b3=new JButton("Check heart health                  .",im3);
	ImageIcon im4=new ImageIcon("bmi.png");
	JButton b4=new JButton("Check BMI                           .",im4);
	ImageIcon im5=new ImageIcon("waterLevel.png");
	JButton b5=new JButton("Check water level                .",im5);
	ImageIcon im6=new ImageIcon("doctor.png");
	JButton b6=new JButton("Consult a physician            .",im6);
	
	g.gridx=0;
	g.gridy=1;
	p.add(b1,g);
	
	g.gridx=0;
	g.gridy=2;
	p.add(b4,g);
	
	g.gridx=0;
	g.gridy=3;
	p.add(b3,g);
	
	g.gridx=1;
	g.gridy=1;
	p.add(b2,g);
	
	g.gridx=1;
	g.gridy=2;
	p.add(b5,g);
	
	g.gridx=1;
	g.gridy=3;
	p.add(b6,g);
	
	f.add(p,BorderLayout.EAST);
	f.add(imP,BorderLayout.WEST);
	
	b1.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			calorie_meter cm=new calorie_meter();
		}
	});
	
	
	b2.addActionListener(new ActionListener() // PROBLEM WITH diabetes_meter
	{
		public void actionPerformed(ActionEvent e)
		{
			//Add diabetes_meter
			diabetes_meter dm=new diabetes_meter();
		}
	});
	
	
	b3.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			//Add heart
			heart_meter hm=new heart_meter();
		}
	});
	
	
	b4.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			double height=Double.parseDouble(JOptionPane.showInputDialog("Enter your height(m): "));
			double weight=Double.parseDouble(JOptionPane.showInputDialog("Enter your weight(kg): "));
			BMI bmi=new BMI(height,weight);
		}
	});
	
	
	b5.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			double age=Double.parseDouble(JOptionPane.showInputDialog("Enter your age (year): "));
			double water=Double.parseDouble(JOptionPane.showInputDialog("How much water you drink (Liter)?: "));
			dehydration_meter dh=new dehydration_meter(age,water);
		}
	});
	
	
	b6.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			String n;      // new user?
			String nn;     // new name
			String np;     //new password
			
			String usn=JOptionPane.showInputDialog("User Name: ");
			String pass=JOptionPane.showInputDialog("Password: ");
			int varify=us.check(usn,pass);
			
			if(varify==1)    //Procced to consult doctor
			{
				
			}
			else if(varify!=1)
			{
				n=JOptionPane.showInputDialog("Do you want to consult a doctor (y/n):");
				if(n.equals("Y")||n.equals("y"))
				{
					nn=JOptionPane.showInputDialog("Set your user name (within 20 charecters): ");
					np=JOptionPane.showInputDialog("Set your password (within 25 charecters): ");
					db=addNewMember(db,nn,np);
					JOptionPane.showMessageDialog(null, "Welcome! You will be directed to a physician shortly...");
				}
				else
					JOptionPane.showMessageDialog(null, "Thanks! Please try again later!");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Your system doesn't satisfy all requirements!");
			}
			
		}
	});
	
	}
}
