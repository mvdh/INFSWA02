package social;

public class ImageHeader implements Header<Integer> {

	private int content;
	
	@Override
	public Integer getContent() {
		return this.content;
	}
	
	public void setContent(int i) {
		this.content = i;
	}
}
