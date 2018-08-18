import java.text.DecimalFormat;

import javax.swing.JOptionPane;
public class BMI {
double bmi,weight,height;
BMI(double h,double w)
{
	this.height=h;
	this.weight=w;
	this.bmi=weight/(height*height);
	resultBMI(bmi);
}

public void resultBMI(double b)
{
	DecimalFormat df = new DecimalFormat();
	df.setMaximumFractionDigits(2);
	if(b<18.5)
		JOptionPane.showMessageDialog(null, "Your BMI: "+df.format(b)+"\nStatus: Underweight");
	else if(b>=18.5 && b<23)
		JOptionPane.showMessageDialog(null, "Your BMI: "+df.format(b)+"\nStatus: Normal");
	else if(b>=23 && b<25)
		JOptionPane.showMessageDialog(null, "Your BMI: "+df.format(b)+"\nStatus: Overweight");
	else if(b>=25)
		JOptionPane.showMessageDialog(null, "Your BMI: "+df.format(b)+"\nStatus: Overwight. High risk!");
}
}
