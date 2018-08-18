import java.text.DecimalFormat;

import javax.swing.JOptionPane;
public class dehydration_meter {
	dehydration_meter(double age, double water){
		
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);
		
		if(age<1)
		{
			if(water<1.0)
				JOptionPane.showMessageDialog(null, "DeHydrated! Drink "+df.format(1-water)+" liter more!");
			else
				JOptionPane.showMessageDialog(null, "Your are Hydrated enough");
		}
		else if(age>=1 && age<4)
		{
			if(water<1.2)
				JOptionPane.showMessageDialog(null, "DeHydrated! Drink "+df.format(1.2-water)+" liter more!");
			else
				JOptionPane.showMessageDialog(null, "Your are Hydrated enough");
		}
		else if(age>=4 && age<9)
		{
			if(water<1.4)
				JOptionPane.showMessageDialog(null, "DeHydrated! Drink "+df.format(1.4-water)+" liter more!");
			else
				JOptionPane.showMessageDialog(null, "Your are Hydrated enough");
		}
		else if(age>=9 && age<14)
		{
			if(water<1.5)
				JOptionPane.showMessageDialog(null, "DeHydrated! Drink "+df.format(1.5-water)+" liter more!");
			else
				JOptionPane.showMessageDialog(null, "Your are Hydrated enough");
		}
		else if(age>=14 && age<18)
		{
			if(water<1.7)
				JOptionPane.showMessageDialog(null, "DeHydrated! Drink "+df.format(1.7-water)+" liter more!");
			else
				JOptionPane.showMessageDialog(null, "Your are Hydrated enough");
		}
		else if(age>=18)
		{
			if(water<2.5)
				JOptionPane.showMessageDialog(null, "DeHydrated! Drink "+df.format(2.5-water)+" liter more!");
			else
				JOptionPane.showMessageDialog(null, "Your are Hydrated enough");
		}
	}
}
