package social;

public class ImageBody implements Body<Integer> {

	private int content;
	
	@Override
	public Integer getContent() {
		return this.content;
	}
	
	public void setContent(int i) {
		this.content = i;
	}
}