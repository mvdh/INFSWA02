package social;

public interface MessageComponentFactory {

	public Header createHeader();
	public Body createBody();
	public Footer createFooter();
}
