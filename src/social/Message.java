package social;

public class Message {

	MessageComponentFactory componentFactory;
	Header header;
	Body body;
	Footer footer;
	
	public Message(MessageComponentFactory cf){
		componentFactory = cf;
		
		header = componentFactory.createHeader();
		body = componentFactory.createBody();
		footer = componentFactory.createFooter();
		
	}
}
