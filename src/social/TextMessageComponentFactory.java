package social;

public class TextMessageComponentFactory implements MessageComponentFactory {

	@Override
	public Header<String> createHeader() {
		return new TextHeader();
	}

	@Override
	public Body<String> createBody() {
		return new TextBody();
	}

	@Override
	public Footer<String> createFooter() {
		return new TextFooter();
	}
}
