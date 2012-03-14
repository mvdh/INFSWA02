package social;

public class ImageMessageComponentFactory implements MessageComponentFactory {

	@Override
	public Header<String> createHeader() {
		return new ImageHeader();
	}

	@Override
	public Body<String> createBody() {
		return new ImageBody();
	}

	@Override
	public Footer<String> createFooter() {
		return new ImageFooter();
	}
}
