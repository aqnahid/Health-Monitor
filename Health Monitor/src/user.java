import javax.swing.JOptionPane;
public class user {
	int cnt=0;
	arrange var=new arrange();
	int totalMember=var.db.length;
	int check(String id, String pass)
	{
		for(int i=0;i<totalMember;i++)
		{
			if(id.equals(var.db[i][0])&&pass.equals(var.db[i][1]))
			{
				cnt=1;
				break;
			}
			else if(id.equals(var.db[i][0])&&!pass.equals(var.db[i][1]))
			{
				cnt=2;
			}
			else
			{
				if(cnt!=2)
					cnt=3;
			}
		}
		if(cnt==3)
			JOptionPane.showMessageDialog(null, "You are not a member!");
		else if(cnt==2)
			JOptionPane.showMessageDialog(null, "Forgot password?");
		else if(cnt==1)
			JOptionPane.showMessageDialog(null, "Welcome! You will be directed to a physician shortly...");
		else
			JOptionPane.showMessageDialog(null, "Error! Please report!");
		return cnt;
	}
}
