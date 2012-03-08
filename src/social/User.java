package social;

public class User {

	ProxyMessageFactory messageFactory;
	UserMessages<Message> messages;
	
	public User(ProxyMessageFactory mf){
		messages = new UserMessages<Message>();
		messageFactory = mf;
	}
	
	public void createMessage(MessageComponentFactory mcf, String header, String body, String footer){
		Message message = new Message(mcf);
		message.header.set(header);
		message.body.set(body);
		message.footer.set(footer);
		messages.add(message);
	}
	
}
