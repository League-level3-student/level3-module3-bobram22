package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String newS = "";
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			newS= c+newS;
		}
		return newS;
	}

}
