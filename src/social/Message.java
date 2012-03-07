package social;

public class Message {

	private Header header;
	private Body body;
	private Footer footer;
	
	private final MessageComponentFactory mCFactory;

	public Message(MessageComponentFactory mCF) {
		this.mCFactory = mCF;
	}
	
	public void composeMessage() {
		this.header = mCFactory.createHeader();
		this.body = mCFactory.createBody();
		this.footer = mCFactory.createFooter();
	}
}
