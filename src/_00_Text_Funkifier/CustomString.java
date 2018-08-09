package _00_Text_Funkifier;

public class CustomString extends SpecialString{

	public CustomString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String newS = "";
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(i%2==0) {	
				c=Character.toUpperCase(c);
			}
			else {
				c=Character.toLowerCase(c);
			}
			newS = c+ newS;
		}
		return newS;
	}


}
