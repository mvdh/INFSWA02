package social;

public class TextBody implements Body<String> {

	private String content;
	
	@Override
	public String getContent() {
		return this.content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}

}
