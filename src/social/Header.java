package social;

public abstract class Header {
	public String text;
	
	public void set(String st) {
		text = st;	
	}

	public String get() {
		return text;
	}
}
