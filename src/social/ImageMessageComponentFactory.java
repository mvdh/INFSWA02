package social;

public class ImageMessageComponentFactory implements MessageComponentFactory {

	@Override
	public Header<Integer> createHeader() {
		return new ImageHeader();
	}

	@Override
	public Body<Integer> createBody() {
		return new ImageBody();
	}

	@Override
	public Footer<Integer> createFooter() {
		return new ImageFooter();
	}
}
