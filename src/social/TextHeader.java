package social;

public class TextHeader implements Header<String> {

	private String content;
	
	@Override
	public String getContent() {
		return this.content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}

}