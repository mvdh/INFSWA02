package social;

public class TextFooter implements Footer<String> {

	private String content;
	
	@Override
	public String getContent() {
		return this.content;
	}
}
