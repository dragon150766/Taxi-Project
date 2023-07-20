import java.io.*;

public class check {
	
	private static String ID, Pass, Cradit;
	private static float Money;
	
	public check(String ID, String Pass, String Cradit, float Money) {
		this.ID = ID;
		this.Pass = Pass;
		this.Cradit = Cradit;
		this.Money = Money;
	}
	
	public check(String ID, String Pass) {
		this(ID, Pass, null, 0);
	}
	
	public String getID() {
		return this.ID;
	}
	
	public String getPass() {
		return this.Pass;
	}
	
	public String getCradit() {
		return this.Cradit;
	}
	
	public boolean Scheck() throws IOException{
		BufferedReader read = new BufferedReader(new FileReader("data.txt"));
		String temp = "";
		boolean check = false;
		while( (temp = read.readLine()) != null) {
			String data[] = temp.split("/");
			String a = data[0];
			String Pa = data[1];
			String c = data[2];
			
			
			if(a.equals(ID) && Pa.equals(Pass)) {
				check = true;
				this.Cradit = c;
				
				break;
			}
			else {
				check = false;
				
			}
		}
		read.close();
		
		if(check == true) {
			
			return (true);
		}
		else {
			return (false);
		}
	}
	
	public void getMoney(String ID) throws IOException{
		BufferedReader read = new BufferedReader(new FileReader("user\\"+ID+"Money.txt"));
		String temp = "";
		while( (temp = read.readLine()) != null) {
			String data[] = temp.split("/");
			String money = data[0];
			float Rmoney = Float.parseFloat(money);
			this.Money = Rmoney;
			read.close();
	}
		
	}
	
}
