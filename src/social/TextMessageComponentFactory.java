package social;

public class TextMessageComponentFactory implements MessageComponentFactory {

	@Override
	public Header createHeader() {
		return new TextHeader();
	}

	@Override
	public Body createBody() {
		return new TextBody();
	}

	@Override
	public Footer createFooter() {
		return new TextFooter();
	}
}
