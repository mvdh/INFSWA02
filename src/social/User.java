package social;


public class User {

	MessageFactory messageFactoryProxy;
	UserMessages<Message> messages;
	
	public User(MessageFactory mfp){
		messages = new UserMessages<Message>();
		messageFactoryProxy = mfp;
	}
	
	public void createMessage(MessageComponentFactory mcf, String header, String body, String footer){
		Message message = this.messageFactoryProxy.createMessage(mcf);
		message.header.set(header);
		message.body.set(body);
		message.footer.set(footer);
		messages.add(message);
	}
}
