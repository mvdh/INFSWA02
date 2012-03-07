package social;

public class ImageMessageComponentFactory implements MessageComponentFactory {

	@Override
	public Header createHeader() {
		return new ImageHeader();
	}

	@Override
	public Body createBody() {
		return new ImageBody();
	}

	@Override
	public Footer createFooter() {
		return new ImageFooter();
	}
}
