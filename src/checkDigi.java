
public class checkDigi {

	public static String word;
	
	public void setWord(String Word) {
		this.word = Word;
	}
	
	public String getWord() {
		return this.word;
	}
	
	public boolean checkAdigi(String word) {
		boolean Re = true;
		
		for(int i = 0; i < word.length(); i++) {
			if(Character.isDigit(word.charAt(i)) == false) {
				Re = false;
			} 
			
		}
		
		if(word.length() > 4) {
			Re = false;
		}
		else {
			Re = true;
		}
		
		
		return Re;
	}
	
	public String Overmin(String word) {
		String[] data = word.split(":");
		int H = Integer.parseInt(data[0]);
		int M = Integer.parseInt(data[1]);
		if(M >= 60) {
			M = M - 60;
			H++;
		}
		
		String Re =  H + ":"+ M;
		return Re;
	}
	
}
