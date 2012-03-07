package social;

public class ImageFooter implements Footer<Integer> {

	private int content;
	
	@Override
	public Integer getContent() {
		return this.content;
	}
	
	public void setContent(int i) {
		this.content = i;
	}
}
