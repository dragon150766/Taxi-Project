import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class data {

	public static String id;
	public static String Cradit;
	public static float money;
	public static String Location;
	public static String WTG;
	public static float Hw;
	public static String TWG;
	public static float price;
	public static int a;
	public static int b;
	public static String History;
	
	public void setID(String id) {
		this.id = id;
	}
	
	public String getID() {
		return this.id;
	}
	
	
	public void setMoney(String ID) throws IOException{
		float Rmoney = 0;
		try {
			Scanner read = new Scanner(new File("user\\"+ID+"Money.txt"));
			while(read.hasNext()) {
			String a1 = read.next();
			Rmoney = Float.parseFloat(a1);
			
			
			  }
			}
			catch(FileNotFoundException e) {
				
			}
			catch(IOException e) {
				System.out.print("B");
			  }
			
		
		this.money = Rmoney;
	}
	
	public Float getMoney() {
		return this.money;
	}
	
	public void setCradit(String Cradit) {
		this.Cradit = Cradit;
	}
	
	public String getCradit() {
		return this.Cradit;
	}
	
	
	
	public void plusMoney(float N) {
		float Nmoney = this.money + N;
		try {
			PrintWriter write = new PrintWriter(new FileWriter("user\\"+this.id+"Money.txt"));
			write.println(Nmoney);
			write.close();
			
		}catch(IOException e1) {
			
		}
	}
	
	public void setLocation(String Location) {
		this.Location = Location;
	}
	
	public void setWTG(String WTG) {
		this.WTG = WTG;
	}
	
	public void setHw(float HW) {
		this.Hw = HW;
	}
	
	public void setTWG(String TWG) {
		this.TWG = TWG;
	}
	
	public void setPrice(float Price) {
		this.price = Price;
	}
	
	public String getLocation() {
		return this.Location;
	}
	
	public String getWTG() {
		return this.WTG;
	}
	
	public float getHw() {
		return this.Hw;
	}
	
	public String getTWG() {
		return this.TWG;
	}
	
	public float getPrice() {
		return this.price;
	}
	
	public void buy(float N) {
		
		float Nmoney = this.money - N;
		try {
			PrintWriter write = new PrintWriter(new FileWriter("user\\"+this.id+"Money.txt"));
			write.println(Nmoney);
			write.close();
			
		}catch(IOException e1) {
			
		}
	}
	
	public void setA(int A) {
		this.a = A;
	}
	
	public void setB(int B) {
		this.b = B;
	}
	
	public void seePrice() {
		float point = 0;
		if(this.a - this.b > 0) {
			point = this.a - this.b;
		}
		else if(this.b - this.a > 0) {
			point = this.b - this.a;
		}
		
		point = point * 8;
		this.price = point;
		
	}
	
	public void History(String id) {
		try {
		BufferedReader read = new BufferedReader(new FileReader("user\\"+id+"Tax.txt"));
		this.History = "Date  Price  Plan\n";
		String temp = "";
		while( (temp = read.readLine()) != null) {
			String data[] = temp.split("/");
			String date = data[0];
			String Price = data[1];
			String plan = data[2];
			History += date +"  "+Price+"  "+plan+"\n";
		}
	}catch(IOException e) {
		History = "NO DATA, Is First Time";
	 }
	}
	
	public String getHistory() {
		return this.History;
	}

}
